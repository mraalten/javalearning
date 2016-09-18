package nl.hardwin.javalearning.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Persoon {
    private String naam;
    private Adres correspondentieAdres;
    private Factuuradres factuuradres;
    private List<Rekening> rekeningen = new ArrayList<>();
    private LocalDate geboorteDatum;

    public Persoon(String naam, LocalDate geboortDatum) {
        this.naam = naam;
        this.geboorteDatum = geboortDatum;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + ", geb.datum: " + geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public String getNaam() {
        return this.naam;
    }


    /**
     * This method returns an age based on
     * @return the age
     */
    public int getLeeftijd() {
        LocalDate today = LocalDate.now();

        int yearBirthDate = geboorteDatum.getYear();
        int age = today.getYear() - yearBirthDate;
        LocalDate birthDateCurrentYear = LocalDate.of(today.getYear(), geboorteDatum.getMonth().getValue(), geboorteDatum.getDayOfMonth());
        if (birthDateCurrentYear.isAfter(today)) {
            return age - 1;
        }
        return age;
    }
}
