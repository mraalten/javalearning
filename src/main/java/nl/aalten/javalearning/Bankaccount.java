package nl.aalten.javalearning;

/**
 * Created by edwincox on 7-8-2016.
 */
public class Bankaccount{

    private String rekeningnummer;
    private int saldo;

    public Bankaccount(String rekeningnummer, int saldo) {
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

    public void geldOpnemen(int geldOpenmen){
        if (saldo <= 0){
            System.out.println("U kunt geen geld opnemen saldo te weinig");
        }else if (geldOpenmen > saldo){
            System.out.println("U kunt geen geld opnemen saldo te weinig");
        }else{
            saldo = saldo - geldOpenmen;
        }
    }

}
