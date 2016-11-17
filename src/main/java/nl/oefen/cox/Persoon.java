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
}
