package nl.oefen.cox;

/**
 * Created by edwincox on 18-11-2016.
 */
public class Zelfbouw extends Woning {

    private int bouwkosten;

    public Zelfbouw(String straatnaam, int bouwkosten) {
        super(straatnaam);
        this.bouwkosten = bouwkosten;
    }


}
