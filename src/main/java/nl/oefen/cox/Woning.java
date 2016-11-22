package nl.oefen.cox;

/**
 * Created by edwincox on 18-11-2016.
 */
public abstract class Woning {

    private Adres adres;

    public Woning(String straatnaam) {
        adres = new Adres(straatnaam);
    }

    public Adres getAdres() {
        return adres;
    }

    @Override
    public String toString() {
        return "Woningadres: " + adres + " Betreft bouw: " + getbouw() + " Bedrag: " + getPrefix() ;

    }

    abstract int getPrefix();

    abstract String getbouw();
}
