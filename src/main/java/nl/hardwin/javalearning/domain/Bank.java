package nl.hardwin.javalearning.domain;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {

    public static final String BANK_IDENTIFICATION = "NLHDWN0";
    private Map<String, Rekening> rekeningen = new HashMap<>();
    private Map<String, Persoon> personen = new HashMap<>();
    private int totalAmountSavings;

    public Betaalrekening openBetaalrekening(String bsnNummer, String naam, LocalDate geboorteDatum, int saldo, int kredietLimiet) {
        Persoon persoon = findperson(bsnNummer, naam, geboorteDatum);
        Betaalrekening betaalrekening = new Betaalrekening(saldo, kredietLimiet, persoon);
        addRekening(betaalrekening, naam, geboorteDatum);
        return betaalrekening;
    }

    public Spaarrekening openSpaarrekening(String bsnNummer, String naam, LocalDate geboorteDatum, int saldo, int kredietLimiet){
        Persoon persoon = findperson(bsnNummer, naam, geboorteDatum);
        Spaarrekening spaarrekening = new Spaarrekening(saldo, kredietLimiet, persoon);
        addRekening(spaarrekening, naam, geboorteDatum);
        return spaarrekening;
    }

    private void addRekening(Rekening rekening, String naam, LocalDate geboorteDatum) {
        this.rekeningen.put(rekening.getRekeningNummer(), rekening);
        totalAmountSavings = totalAmountSavings + rekening.getSaldo();
    }

    public int getTotalAmountSavings() {
        return totalAmountSavings;
    }

    /**
     * This method tries to find a person based on BSN-number. If it does not exist it will create a new one and
     * add it to the list
     * @param bsnNummer the bsnNumber
     * @param naam the name
     * @param geboorteDatum the geboortedatum
     * @return a person
     */
    @NonNull
    public Persoon findperson(String bsnNummer, String naam, LocalDate geboorteDatum){
        Persoon persoon = personen.get(bsnNummer);
        if (persoon == null) {
            persoon = new Persoon(naam, geboorteDatum);
            this.personen.put(bsnNummer, persoon);
        }
        return persoon;
    }

    /**
     * Deposit some money on the account for the provided customer.
     *
     * @param rekeningNummer the person to add the money to it's account
     * @param amountToDeposit the amount to deposit, should be greater than zero
     */
    public synchronized void deposit(String rekeningNummer, int amountToDeposit) {
        Rekening rekening = getRekening(rekeningNummer);
        rekening.stortGeld(amountToDeposit);
        totalAmountSavings = totalAmountSavings + amountToDeposit;
    }

    public Rekening getRekening(String rekeningNummer) {
        Rekening rekening = rekeningen.get(rekeningNummer);
        if (rekening == null){
            throw new IllegalStateException("De opgegeven rekening bestaat niet met waarde " + rekeningNummer);
        }
        return rekening;
    }

    public synchronized void withdraw(String rekeningNummer, int amountToWithdraw) {
        Rekening rekening = getRekening(rekeningNummer);
        rekening.geldOpnemen(amountToWithdraw);
        totalAmountSavings = totalAmountSavings - amountToWithdraw;
    }

    public void printOverzichtTransacties(String rekeningNummer){
        Rekening rekening = getRekening(rekeningNummer);
        rekening.printTransactie();
    }

    public void transferMoney(String rekeningNummerFrom, String rekeningNummerTo, int amount){
        withdraw(rekeningNummerFrom, amount);
        deposit(rekeningNummerTo, amount);

    }

    public List<Rekening> getAllRekeningen() {
        return new ArrayList<>(rekeningen.values());
    }
}
