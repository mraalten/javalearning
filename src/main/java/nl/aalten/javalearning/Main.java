package nl.aalten.javalearning;

public class Main {

    public static void main(String[] args) {

        Person edwin = new Person();

        edwin.setNaam("Edwin");
        edwin.setStraatnaam("Goudsmidstraat");
        edwin.setHuisnummer("12");
        edwin.setHuisnummerToevoeging("AB");
        edwin.setPostcode("5811 PP");
        edwin.setWoonplaats("Venray");

        System.out.println("Naam: " + edwin.getNaam());
        System.out.println("Straatnaam " + edwin.getStraatnaam());
        System.out.println("Huisnummer " + edwin.getHuisnummer());
        System.out.println("HuisnummerToevoeging " + edwin.getHuisnummerToevoeging());
        System.out.println("Postcode " + edwin.getPostcode());
        System.out.println("Woonplaats: " + edwin.getWoonplaats());

        Adres adres = new Adres();
        adres.setStraatNaam("Voorthuizerstraat");
        adres.setHuisnummer(47);
        adres.setPostcode("3881SB");
        adres.setWoonplaats("Putten");

        System.out.println("--------------------");

        Person richard = new Person("Richard", adres);
        System.out.println("Naam: " + richard.getNaam());
        System.out.println(adres.toString());
    }

}
