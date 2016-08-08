package nl.aalten.javalearning;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // De makkelijke manier
//        Person bart = new Person();
//        bart.setNaam("Bart Cox");
//        bart.setGeboorteDatum(1988);
//        System.out.println("De de naam is: " + bart.getNaam() + " en mijn leeftijd is: " + bart.getLeeftijd() );

        // Functie met Date
        Person hans = new Person("Hans", "454545", 100);
        System.out.println(hans.getNaam() + " " + hans.getBankaccount());

        Person edwin = new Person("Edwin", "99999", 150);
        edwin.setGeboorteDatum(LocalDate.of(1984, 7, 2));
        System.out.println(edwin.getSaldo());
        System.out.println("Edwin's bankaccount is: " + edwin.getBankaccount() + " het saldo is: " + edwin.getBankaccount().getSaldo());

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
