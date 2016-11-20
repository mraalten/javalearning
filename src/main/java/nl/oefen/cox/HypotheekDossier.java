package nl.oefen.cox;

import java.time.LocalDate;
import java.util.HashMap;

/**
 * Created by edwincox on 15-11-2016.
 */
public class HypotheekDossier {

    private int id;
    private Persoon persoon;
    private Annuiteit annuiteit;
    private Linear linear;
    private Woning woning;
    private Nieuwbouw nieuwbouw;
    private Zelfbouw zelfbouw;
    private HashMap<Integer, Object> leningen = new HashMap<Integer, Object>();
    //private Map<String, Rekening> rekeningen = new HashMap<>();



    public HypotheekDossier(String naam, LocalDate geboorteDatum, String straatNaam) {
        persoon = new Persoon(naam, geboorteDatum, straatNaam);
    }

    public int addPersoon(String naam, LocalDate geboorteDatum, String straatNaam){
      persoon = new Persoon(naam, geboorteDatum, straatNaam);

        return id;
    }

    public void addAnnuiteit(int id, int bedrag, int termijnenAnnuiteit){
        annuiteit = new Annuiteit(bedrag, termijnenAnnuiteit);
        this.id = id;
        this.leningen.put(getId(), bedrag);

        // Hier gebleven
    }

    public int getId() {
        return id;
    }

    public void addLineaire(int bedrag, int looptijd){
        linear = new Linear(bedrag, looptijd);

    }

    public void addNieuwbouw(String straatnaam, int koopsom){
        nieuwbouw = new Nieuwbouw(straatnaam, koopsom);

    }

    public void addZelfbouw(String straatNaam, int bouwkosten){
        zelfbouw = new Zelfbouw(straatNaam, bouwkosten);
    }

    public Persoon getPersoon() {
        return persoon;
    }

}
