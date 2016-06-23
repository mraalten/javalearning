package nl.aalten.javalearning;

public class Main {

    public static void main(String[] args) {

        Person naam = new Person();
        Adres correspondentieAdres  = new Adres();
        Adres factuurAdres   = new Adres();



        naam.setNaam("Edwin");
        correspondentieAdres.setStraatnaam("Goudsmidstraat");
        correspondentieAdres.setHuisnummer("12");
        correspondentieAdres.setHuisnummerToevoeging("AB");
        correspondentieAdres.setPostcode("5811 PP");
        correspondentieAdres.setWoonplaats("Venray");

        factuurAdres.setStraatnaam("Willemstraat");
        factuurAdres.setHuisnummer("44");
        factuurAdres.setHuisnummerToevoeging("DD");
        factuurAdres.setPostcode("1212 zz");
        factuurAdres.setWoonplaats("Utrecht");


        System.out.println("Naam: " + naam.getNaam());
        System.out.println("Straatnaam " + correspondentieAdres.getStraatnaam());
        System.out.println("Huisnummer " + correspondentieAdres.getHuisnummer());
        System.out.println("HuisnummerToevoeging " + correspondentieAdres.getHuisnummerToevoeging());
        System.out.println("Postcode " + correspondentieAdres.getPostcode());
        System.out.println("Woonplaats: " + correspondentieAdres.getWoonplaats());
        System.out.println("*************");
        System.out.println("Naam: " + naam.getNaam());
        System.out.println("Straatnaam " + factuurAdres.getStraatnaam());
        System.out.println("Huisnummer " + factuurAdres.getHuisnummer());
        System.out.println("HuisnummerToevoeging " + factuurAdres.getHuisnummerToevoeging());
        System.out.println("Postcode " + factuurAdres.getPostcode());
        System.out.println("Woonplaats: " + factuurAdres.getWoonplaats());


    }

}
