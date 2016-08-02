package nl.aalten.javalearning;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // De makkelijke manier
//        Person bart = new Person();
//        bart.setNaam("Bart Cox");
//        bart.setGeboorteDatum(1988);
//        System.out.println("De de naam is: " + bart.getNaam() + " en mijn leeftijd is: " + bart.getLeeftijd() );

        // Functie met Date
        Person edwin = new Person();
        edwin.setNaam("Edwin");
        edwin.setGeboorteDatum(new Date(84, 7, 2));

        Person nicolette = new Person();
        nicolette.setNaam("Nicolette");

        edwin.setPartner(nicolette);

        System.out.println("De de naam is: " + edwin.getNaam() + " en mijn leeftijd is: " + edwin.getLeeftijd() );
        System.out.println("Mijn geboortedatum is " + edwin.getGeboorteDatum());
        System.out.println("De partner van Edwin is : " + edwin.getPartner());

        System.out.println("De partner van Nicolette is : " + nicolette.getPartner());

        System.out.println(edwin);

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
