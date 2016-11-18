package nl.oefen.cox;

import java.time.LocalDate;

/**
 * Created by edwincox on 15-11-2016.
 */
public class HypotheekDossier {

    private int id;
    private Persoon persoon;
    private Annuiteit annuiteit;
    private Linear linear;

    public int addPersoon(String naam, LocalDate geboorteDatum, String straatNaam){
      persoon = new Persoon(naam, geboorteDatum, straatNaam);

        return id;
    }

    public void addLening(int bedrag, int termijnenAnnuiteit){
        annuiteit = new Annuiteit(bedrag, termijnenAnnuiteit);
    }


    public void addLineaire(int bedrag, int looptijd){
        linear = new Linear(bedrag, looptijd);

    }

//    public void addPersoon(String naam, LocalDate geboorteDatum, String straatNaam){
//        persoon = new Persoon(naam, geboorteDatum, straatNaam);
//    }


//    public int addLening(int bedrag, int termijnenAnnuiteit){
//        annuiteit = new Annuiteit(bedrag, termijnenAnnuiteit);
//
//
//        return leningDeel;
//    }


    public void addWoning(String naam, LocalDate geboortedatum, String adresgegevens){
       persoon = new Persoon(naam,  geboortedatum,  adresgegevens);

    }

}
