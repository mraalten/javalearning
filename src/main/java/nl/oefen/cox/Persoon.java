package nl.oefen.cox;

import java.time.LocalDate;

public class Persoon {
    private String naam;
    private LocalDate geboorteDatum;
    private Adres adres;

    public Persoon(String naam, LocalDate geboorteDatum, String straatNaam) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        adres = new Adres(straatNaam);

    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public String getAdres() {
        return adres.getStraatNaam();
    }

    public void printPersoonGegevens(){
        System.out.println("Persoon: " + getNaam());
        System.out.println("Geboortedatum: " + getGeboorteDatum());
        System.out.println("Adres: " + getAdres());
    }
}
