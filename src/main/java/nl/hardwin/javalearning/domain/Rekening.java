package nl.hardwin.javalearning.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Rekening {

    public static final int MINIMUM_START_SALDO = 100;
    public static final int MAXIMUM_ROOD_STAAN = -100;
    private Persoon persoon;
    protected int saldo;
    private String rekeningnummer;

    List<Transactie> transacties = new ArrayList<>();
    protected int kredietLimiet;

    public Rekening(int saldo, int kredietLimiet, Persoon persoon) {
        if (saldo < MINIMUM_START_SALDO){
            throw new IllegalStateException("Het minumum te storten bedrag is " + MINIMUM_START_SALDO + " euro");
        }
        this.rekeningnummer = generateRekeningNummer();
        this.saldo = saldo;
        this.kredietLimiet = -kredietLimiet;
        this.persoon = persoon;
    }

    private String generateRekeningNummer() {
        Random randomGenerator = new Random();
        StringBuilder sb = new StringBuilder();
        for (int idx = 1; idx <= 5; ++idx){
            int randomInt = randomGenerator.nextInt(10);
            sb.append(randomInt);
        }
        return Bank.BANK_IDENTIFICATION + getPrefix() + sb.toString();
    }

    abstract String getPrefix();

    public List<Transactie> getTransacties() {
        return transacties;
    }

    public String getVolledigeNaam() {
        return persoon.getVolledigeNaam();
    }


    @Override
    public String toString() {
        return "Bankaccount{" +
                "rekeningnummer='" + rekeningnummer + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public int getSaldo() {
        return saldo;
    }

    public int getSpaarSaldo(){
        return saldo;
    }


    protected boolean onvoldoendeSaldoEnKredietlimietBereikt(int bedrag) {
        int saldoNaOpname = saldo - bedrag;
        return saldoNaOpname < 0 && saldoNaOpname < kredietLimiet;
    }

    public void setCustomer(Persoon persoon) {
        this.persoon = persoon;
    }

    public void printTransactie(){
        System.out.println("Afschrijft van: " + persoon.getNaam());
        System.out.println("Betreft rekeningnummer: " + rekeningnummer);
    for (Transactie transactie:transacties){
        System.out.println(transactie.getDatum()
                + " " + transactie.getOmschrijving()
                + " " + transactie.getBedrag()
                + " " + transactie.getOpAfname());
    }

    }

    public String getRekeningNummer() {
        return rekeningnummer;
    }


    public abstract void stortGeld(int amountToDeposit);

    public abstract void geldOpnemen(int amountToWithdraw);
}

