package nl.aalten.javalearning;

import java.util.Date;

public class Person {

    private String naam;
    private Adres correspondentieAdres;
    private int GeboorteDatum ;
    private Date GeboorteDatumProbeer;


    public int getGeboorteDatum() {
        return GeboorteDatum;
    }

    public void setGeboorteDatum(int geboorteDatum) {
        int jaarNu = 2016;
        int leeftijdis = jaarNu - geboorteDatum;
        GeboorteDatum = leeftijdis;
    }

    public Date getGeboorteDatumProbeer() {
        return GeboorteDatumProbeer;
    }

    public void setGeboorteDatumProbeer(Date geboorteDatumProbeer) {
        GeboorteDatumProbeer = geboorteDatumProbeer;
    }

    @Override
    public String toString() {
        return "Naam " + naam;
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

}
