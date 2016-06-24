package nl.aalten.javalearning;

public class Main {

    public static void main(String[] args) {

        Person naam = new Person();
        naam.setNaam("Edwin");

        Adres correspondentieAdres  = new Adres();
        correspondentieAdres.setStraatnaam("Goudsmidstraat");
        correspondentieAdres.setHuisnummer("12");
        correspondentieAdres.setHuisnummerToevoeging("AB");
        correspondentieAdres.setPostcode("5811 PP");
        correspondentieAdres.setWoonplaats("Venray");

        Adres factuurAdres   = new Adres();
        factuurAdres.setStraatnaam("Willemstraat");
        factuurAdres.setHuisnummer("44");
        factuurAdres.setHuisnummerToevoeging("DD");
        factuurAdres.setPostcode("1212 zz");
        factuurAdres.setWoonplaats("Utrecht");


        System.out.println("Naam: " + naam.getNaam());
        System.out.println(correspondentieAdres.toString());
        System.out.println("*************");
        System.out.println(factuurAdres.toString());

    }

}
