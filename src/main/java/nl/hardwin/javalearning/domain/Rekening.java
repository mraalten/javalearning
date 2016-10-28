package nl.hardwin.javalearning.domain;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Rekening {

    public static final int MINIMUM_START_SALDO = 100;
    public static final int MAXIMUM_ROOD_STAAN = -100;
    private Persoon persoon;
    private String rekeningnummer;
    private int saldo;
    private List<Transactie> transacties = new ArrayList<>();
    private Transactie transactie;
    private String controleMagJeRoodStaan;

    public Rekening(String rekeningnummer, int saldo, String controleMagJeRoodStaan) {
        if (saldo < MINIMUM_START_SALDO){
            throw new IllegalStateException("Het minumum te storten bedrag is " + MINIMUM_START_SALDO + " euro");
        }
        this.rekeningnummer = rekeningnummer;
        this.saldo = saldo;
        this.controleMagJeRoodStaan = controleMagJeRoodStaan;
    }

    public String magIkRoodStaanControle(String rekeningnummer){
        return getControleMagJeRoodStaan();
    }

    public String getControleMagJeRoodStaan() {
        return controleMagJeRoodStaan;
    }

    public List<Transactie> getTransacties() {
        return transacties;
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


    public void stortGeld(int stortGeld){
        if (stortGeld >= 0) {
            saldo = stortGeld + saldo;
            Transactie transactie = new Transactie("Storting", new BigDecimal(stortGeld), OpAfnameType.STORTEN);
            transacties.add(transactie);
        } else {
            throw new IllegalArgumentException("U kunt geen negatief bedrag storten");
        }
    }

    public void geldOpnemen(int geldOpenmen) {
        if (magIkRoodStaanControle(rekeningnummer) == "ja") {
            int beschermgetal = saldo - MAXIMUM_ROOD_STAAN;

            if (beschermgetal >= geldOpenmen && saldo > MAXIMUM_ROOD_STAAN) {
                saldo = saldo - geldOpenmen;
                Transactie transactie = new Transactie("Opnamen", new BigDecimal(geldOpenmen), OpAfnameType.OPNEMEN);
                transacties.add(transactie);
            } else {
                System.out.println("U kunt geen geld opnemen saldo te weinig, transactie wordt verbroken");
            }
        }else{
            if (saldo > 0 && saldo >= geldOpenmen) {
                saldo = saldo - geldOpenmen;
                Transactie transactie = new Transactie("Opnamen", new BigDecimal(geldOpenmen), OpAfnameType.OPNEMEN);
                transacties.add(transactie);
            } else {
                throw new IllegalStateException("U kunt geen geld opnemen saldo te weinig");
            }
        }
    }

    public void addCustomer(Persoon persoon) {
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

}

