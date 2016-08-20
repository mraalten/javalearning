package nl.hardwin.javalearning.domain;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by edwincox on 7-8-2016.
 */
public class Rekening {

    private String rekeningnummer;
    private int saldo;
    private List<Transactie> transacties = new ArrayList<>();

    public Rekening(String rekeningnummer, int saldo) {
        this.rekeningnummer = rekeningnummer;
        this.saldo = saldo;
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


    public void stortGeld(int stortGeld){
        if (stortGeld >= 0) {
            saldo = stortGeld + saldo;
            new Transactie("Storting", new BigDecimal(stortGeld), OpAfnameType.STORTEN);
        } else {
            throw new IllegalArgumentException("U kunt geen negatief bedrag storten");
        }
    }

    public void geldOpnemen(int geldOpenmen) {
        if (saldo > 0 && saldo >= geldOpenmen) {
            saldo = saldo - geldOpenmen;
            new Transactie("Opnamen", new BigDecimal(geldOpenmen), OpAfnameType.OPNEMEN);
        } else {
            throw new IllegalStateException("U kunt geen geld opnemen saldo te weinig");
        }
    }


}

