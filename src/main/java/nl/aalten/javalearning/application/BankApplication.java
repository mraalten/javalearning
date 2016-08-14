package nl.aalten.javalearning.application;

import nl.aalten.javalearning.Adres;
import nl.aalten.javalearning.Factuuradres;
import nl.aalten.javalearning.Person;

import java.time.LocalDate;

public class BankApplication {

    public static void main(String[] args) {

        Bank rabobank = new Bank();

        Person richard = new Person("Richard", LocalDate.of(1970, 4, 9), "NLRABO0354223546", 150);
        rabobank.addCustomer(richard);
        rabobank.withdraw(richard, 50);
        rabobank.deposit(richard, 175);


        Person edwin = new Person("Edwin", LocalDate.of(1984, 7, 2), "NLRABO0233456437", 200);
        rabobank.addCustomer(edwin);
        rabobank.withdraw(edwin, 75);
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
