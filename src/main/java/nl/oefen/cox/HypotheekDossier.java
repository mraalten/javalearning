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
    
    public HypotheekDossier(String naam, LocalDate geboorteDatum, String straatNaam) {
        persoon = new Persoon(naam, geboorteDatum, straatNaam);
    }

    public Persoon getPersoon() {
        return persoon;
    }

    public void addLening(Lening lening) {
        leningen.add(lening);
    }

    public void addWoning(Woning woning){
        woningen.add(woning);
    }
}
