package nl.aalten.javalearning;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person edwin = new Person("Edwin", "Goudsmidstraat");
        Leeftijd test = new Leeftijd("06/06/1984");
        Date geboorteDatum = new Date();
        System.out.println("Mijn naam is " + edwin.getNaam());
        System.out.println("Mijn adres is " + edwin.getAdres());

        System.out.println("Mijn adres is " + test.getOud());


    }

}
