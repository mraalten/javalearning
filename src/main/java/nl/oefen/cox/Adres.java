package nl.oefen.cox;

/**
 * Created by edwincox on 15-11-2016.
 */
public class Adres {
    private String straatNaam;

    public Adres(String straatNaam) {
        this.straatNaam = straatNaam;
    }

    public String getStraatNaam() {
        return straatNaam;
    }

    @Override
    public String toString() {
        return straatNaam  ;
    }
}
