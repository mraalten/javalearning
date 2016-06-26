package nl.aalten.javalearning;


import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person edwin = new Person();
        edwin.setNaam("Edwin");

        Person richard = new Person();
        richard.setNaam("richard");
        System.out.println("Naam: " + richard.getNaam());

        BerekenGeboortedatum bart = new BerekenGeboortedatum();
        bart.setDatum(new Date(84, 6, 6));
        System.out.println("Bart geboortedatum " + bart.getDatum());


        //Adres printAdres1 = adresCreate("Goudsmidstraat", "22", "aa", "8989 ZZ", "Venraytje");
        //edwin.setCorrespondentieAdres(printAdres1);
        // Uitprobeersel bovenste code
        edwin.setCorrespondentieAdres(adresCreate("Goudsmidstraat", "22", "aa", "8989 ZZ", "Venraytje"));
        System.out.println(edwin.getCorrespondentieAdres());

        System.out.println("***********");
        Adres printAdres2 = adresCreate("drabbelsweg", "6", "ZF", "3434 er", "Veulen");
        System.out.println(printAdres2);

        System.out.println("*************");
        Factuuradres printCorres1 = correspondentieCreate("Bolliewood", "666", "LL", "3434 pp", "9999 TT","Hollywood");
        System.out.println("" + printCorres1);

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
