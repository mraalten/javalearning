package nl.hardwin.javalearning.application;

import nl.hardwin.javalearning.Adres;
import nl.hardwin.javalearning.Bank;
import nl.hardwin.javalearning.Factuuradres;
import nl.hardwin.javalearning.Persoon;

import java.time.LocalDate;

public class BankApplication {
    private static Bank rabobank = new Bank();

    public static void main(String[] args) {

        Persoon richard = new Persoon("Richard", LocalDate.of(1970, 4, 9), "NLRABO0354223546", 150);
        rabobank.addCustomer(richard);
        rabobank.deposit(richard, 175);

        Persoon edwin = new Persoon("Edwin", LocalDate.of(1984, 7, 2), "NLRABO0233456437", 200);
        rabobank.addCustomer(edwin);
        rabobank.withdraw(edwin, 75);
        printTotalSavings();

    }

    private static void printTotalSavings() {
        System.out.println("Totaal saldo van spaarrekeningen is nu: " + Util.formatAmount(rabobank.getTotalAmountSavings()));
    }

    private static Adres adresCreate(String straatnaam, String Huisnummer, String HuisnummerToevoeging, String postcode, String Woonplaats){
        Adres adres  = new Adres();
        adres.setStraatnaam(straatnaam);
        adres.setHuisnummer(Huisnummer);
        adres.setHuisnummerToevoeging(HuisnummerToevoeging);
        adres.setPostcode(postcode);
        adres.setWoonplaats(Woonplaats);
        return adres;
    }

    private static Factuuradres correspondentieCreate(String straatnaam, String huisnummer, String huisnummertoevoeging, String postcode, String postbus, String woonplaats){
        Factuuradres correspondentieAdres = new Factuuradres();
        correspondentieAdres.setStraatnaam(straatnaam);
        correspondentieAdres.setHuisnummer(huisnummer);
        correspondentieAdres.setHuisnummerToevoeging(huisnummertoevoeging);
        correspondentieAdres.setPostcode(postcode);
        correspondentieAdres.setPostbus(postbus);
        correspondentieAdres.setWoonplaats(woonplaats);
        return correspondentieAdres;

    }
}
