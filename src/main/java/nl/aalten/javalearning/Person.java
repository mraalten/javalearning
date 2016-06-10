package nl.aalten.javalearning;

public class Person {
    private String naam;
    private String adres;


    public Person(String naam, String adres) {
        this.naam = naam;
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }
}
