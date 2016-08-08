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

    public String getbankAccount(){
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
        System.out.println("U stort het volgende bedrag " + stortGeld);
        saldo = stortGeld + saldo;
        System.out.println("Uw saldo bedraagt nu " + saldo);
    }

    public void geldOpnemen(int geldOpenmen){
        if (saldo <= 0){
            System.out.println("U kunt geen geld opnemen saldo te weinig");
        }else if (geldOpenmen > saldo){
            System.out.println("U kunt geen geld opnemen saldo te weinig");
        }else{
            System.out.println("U wilt het volgende bedrag opnemen " + geldOpenmen);
            saldo = saldo - geldOpenmen;
            System.out.println("U bedrag is nu " + saldo);
        }
    }

}
