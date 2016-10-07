package nl.hardwin.javalearning.domain;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank {

    private static final String BANK_IDENTIFICATION = "NLHDWN0";
    private Map<String, Rekening> rekeningen = new HashMap<>();
    private Map<String, Persoon> personen = new HashMap<>();
    private Rekening rekening;
    private int totalAmountSavings;
    private String findperson;

    public String openRekening(String bsnNummer, String naam, LocalDate geboorteDatum, int saldo) {
        Persoon persoon = personen.get(bsnNummer);
        if (persoon == null) {
            persoon = new Persoon(naam, geboorteDatum);
            this.personen.put(bsnNummer, persoon);
        }
        String rekeningNummer = generateRekeningNummer();
        Rekening rekening = new Rekening(rekeningNummer, saldo);
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

    public Persoon findperson(String bsnNummer){
        Persoon naam = personen.get(bsnNummer);
        System.out.println(naam);
        return naam;
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

    public synchronized void printOverzichtTransacties(String rekeningNummer){
        Rekening rekening = getRekening(rekeningNummer);
        rekening.printTransactie();
    }

    public synchronized void transfermoney(String rekeningNummerFrom, String rekeningNummerTo, int amout){
        withdraw(rekeningNummerFrom, amout);
        deposit(rekeningNummerTo, amout);
    }

    public int watIsMijnSaldo(String rekeningNummer){
        Rekening rekening = getRekening(rekeningNummer);
        System.out.println("Jou saldo van rekeningnummer: " + rekeningNummer + " is " + rekening.getSaldo());
        return rekening.getSaldo();
    }

}
