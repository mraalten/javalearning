package nl.hardwin.javalearning.domain;

import java.time.LocalDate;

public class Persoon {



    private String naam;
    private Adres correspondentieAdres;
    private Factuuradres factuuradres;


    private LocalDate geboorteDatum;
    private Persoon partner;

    public Persoon(String naam, LocalDate geboortDatum) {
        this.naam = naam;
        this.geboorteDatum = geboortDatum;
    }

    public Persoon getPartner() {
        return partner;
    }

    public void setPartner(Persoon partner) {
        this.partner = partner;
    }


    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + ", geb.datum: " + geboorteDatum;
    }


    public String getNaam() {
        return this.naam;
    }

    public Adres getCorrespondentieAdres(){
        return correspondentieAdres;
    }

    public Adres setCorrespondentieAdres(Adres correspondentieAdres){
        return this.correspondentieAdres = correspondentieAdres;
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