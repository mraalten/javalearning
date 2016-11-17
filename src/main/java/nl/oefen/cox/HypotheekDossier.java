package nl.oefen.cox;

import java.time.LocalDate;

/**
 * Created by edwincox on 15-11-2016.
 */
public class HypotheekDossier {

    private int id;
    private Persoon persoon;

    public void addLening(String naam, LocalDate geboortedatum, String adresgegevens){
        persoon = new Persoon(naam,  geboortedatum, adresgegevens);

    }

    public void addWoning(String naam, LocalDate geboortedatum, String adresgegevens){
       Persoon persoon = new Persoon(naam,  geboortedatum,  adresgegevens);


    }

}
