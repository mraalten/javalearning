package nl.hardwin.javalearning.domain;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank {
    private static final String BANK_IDENTIFICATION = "NLHDWN0";

    private Map<String, Rekening> rekeningen = new HashMap<>();
    private int totalAmountSavings;

    public String openRekening(String naam, LocalDate geboorteDatum, int saldo, String rekeningNummer) {
        Rekening rekening = new Rekening(rekeningNummer, saldo);
        Persoon persoon = new Persoon(naam, geboorteDatum);
        this.rekeningen.put(rekeningNummer, rekening);
        rekening.addCustomer(persoon);
        totalAmountSavings = totalAmountSavings + saldo;
        return rekeningNummer;
    }

    private String generateRekeningNummer() {
        Random randomGenerator = new Random();
        StringBuilder sb = new StringBuilder();
        for (int idx = 1; idx <= 9; ++idx){
            int randomInt = randomGenerator.nextInt(10);
            sb.append(randomInt);
        }
        return BANK_IDENTIFICATION + sb.toString();
    }

    public int getTotalAmountSavings() {
        return totalAmountSavings;
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

    private Rekening getRekening(String rekeningNummer) {
        Rekening rekening = rekeningen.get(rekeningNummer);
        if (rekening == null){
            throw new IllegalStateException("De opgegeven rekening bestaat niet met waarde" + rekeningNummer);
        }
        return rekening;
    }

    public synchronized void withdraw(String rekeningNummer, int amountToWithdraw) {
        Rekening rekening = getRekening(rekeningNummer);
        rekening.geldOpnemen(amountToWithdraw);
        totalAmountSavings = totalAmountSavings - amountToWithdraw;
    }
}
