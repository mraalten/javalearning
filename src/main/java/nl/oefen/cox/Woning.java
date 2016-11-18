package nl.oefen.cox;

/**
 * Created by edwincox on 18-11-2016.
 */
public abstract class Woning {

    private Adres adres;

    public Woning(String straatnaam) {
        adres = new Adres(straatnaam);
    }
}
