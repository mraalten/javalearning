package nl.aalten.javalearning;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //Logger logger=Logger.getLogger("LogDemo");
        //PropertyConfigurator.configure("Log4j.properties");

//        Person edwin = new Person();
//        edwin.setNaam("Edwin");
        //logger.info("Object Edwin wordt gemaakt");

//        Person richard = new Person();
//        richard.setNaam("richard");
//        System.out.println("Naam: " + richard.getNaam());

        // De makkelijke manier
        Person bart = new Person();
        bart.setNaam("Bart Cox");
        bart.setGeboorteDatum(1988);
        System.out.println("De de naam is: " + bart.getNaam() + " en mijn leeftijd is: " + bart.getGeboorteDatum() );

        // Functie met Date
        Person edwin = new Person();
        edwin.setNaam("Edwin");
        edwin.setGeboorteDatumProbeer(new Date(70, 4, 9));
        System.out.println("Leeftijd is " + edwin.getGeboorteDatumProbeer());




        //edwin.setGeboorteDatumMetDate(new Date(70, 4, 9));

        //System.out.println("De de naam is: " + edwin.getNaam() + " en mijn leeftijd is: " + edwin.getGeboorteDatumMetDate());



//        edwin.setCorrespondentieAdres(adresCreate("Goudsmidstraat", "22", "aa", "8989 ZZ", "Venraytje"));
//        System.out.println(edwin.getCorrespondentieAdres());
//
//        System.out.println("***********");
//        Adres printAdres2 = adresCreate("drabbelsweg", "6", "ZF", "3434 er", "Veulen");
//        System.out.println(printAdres2);
//
//        System.out.println("*************");
//        Factuuradres printCorres1 = correspondentieCreate("Bolliewood", "666", "LL", "3434 pp", "9999 TT","Hollywood");
//        System.out.println("" + printCorres1);

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
