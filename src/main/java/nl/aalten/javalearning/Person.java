package nl.aalten.javalearning;

import java.util.Date;

public class Person {

    private String naam;
    private Adres correspondentieAdres;
    private Date geboorteDatum;
    private Person partner;

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }


    public Date getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(Date geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + ", geb.datum: " + geboorteDatum;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public String getNaam() {
        return this.naam;
    }


    public Adres getCorrespondentieAdres(){
        return this.correspondentieAdres;
    }

    public Adres setCorrespondentieAdres(Adres correspondentieAdres){
        return this.correspondentieAdres = correspondentieAdres;
    }

    /**
     * This method returns an age based on
     * @return the age
     */
    public int getLeeftijd() {
        Date today = new Date();
        int year = today.getYear();
        int yearBirthDate = geboorteDatum.getYear();

        return year - yearBirthDate;
    }
}
