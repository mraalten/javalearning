package nl.oefen.cox;

import java.time.LocalDate;


public class Persoon {
    private String naam;
    private LocalDate geboorteDatum;
    private Adres adres;

    public Persoon(String naam, LocalDate geboorteDatum, String adresgegevens) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        Adres adres = new Adres(adresgegevens);

    }
}
