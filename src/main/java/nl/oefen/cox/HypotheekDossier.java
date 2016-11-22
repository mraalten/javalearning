package nl.oefen.cox;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by edwincox on 15-11-2016.
 */
public class HypotheekDossier {

    private int id;

    private Persoon persoon;
    private List<Lening> leningen = new ArrayList<>();
    private List<Woning> woningen = new ArrayList<>();
    private int totaalGeldBedragLeningen;

    public HypotheekDossier(String naam, LocalDate geboorteDatum, String straatNaam) {
        persoon = new Persoon(naam, geboorteDatum, straatNaam);
    }

    public Persoon getPersoon() {
        return persoon;
    }

    public void addLening(Lening lening) {
        totaalGeldBedragLeningen = totaalGeldBedragLeningen + lening.getBedrag();
        leningen.add(lening);
    }

    public void printWoningGegevens(){
        for(Woning woning : woningen) {
            System.out.println(woning.toString());
        }
    }

    public void addWoning(Woning woning){
        woningen.add(woning);
    }

    public void getAantalLeningen(){
        System.out.println("Aantal leningen in de applicatie: " + leningen.size());
    }

    public void getAantalWoningen(){
        System.out.println("Aantal woningen in de applicatie: " + woningen.size());
    }

    public void gettotaalGeldBedragLeningen(){
        System.out.println("Totaal geld bedrag leningen: " + totaalGeldBedragLeningen);
    }

}
