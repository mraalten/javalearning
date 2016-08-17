package nl.hardwin.javalearning;


import java.time.LocalDate;

/**
 * Created by edwincox on 7-8-2016.
 */
public class Rekening {

    private String rekeningnummer;
    private int saldo;
    private LocalDate DatumTransActie = LocalDate.now();

    public Rekening(String rekeningnummer, int saldo) {
        this.rekeningnummer = rekeningnummer;
        this.saldo = saldo;
    }

    public String getRekeningNummer(){
        return rekeningnummer;
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
        } else {
            throw new IllegalArgumentException("U kunt geen negatief bedrag storten");
        }
    }

    public void geldOpnemen(int geldOpenmen) {
        if (saldo > 0 && saldo >= geldOpenmen) {
            saldo = saldo - geldOpenmen;
        } else {
            throw new IllegalStateException("U kunt geen geld opnemen saldo te weinig");
        }
    }

}
