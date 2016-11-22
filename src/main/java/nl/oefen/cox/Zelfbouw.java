package nl.oefen.cox;

/**
 * Created by edwincox on 18-11-2016.
 */
public class Zelfbouw extends Woning {

    private int bouwkosten;
    public static final String ZELFBOUW_BOUWKOSTEN = "Bouwkosten";

    public Zelfbouw(String straatnaam, int bouwkosten) {
        super(straatnaam);
        this.bouwkosten = bouwkosten;
    }

    public int getBouwkosten() {
        return bouwkosten;
    }

    @Override
    int getPrefix() {
        return bouwkosten;
    }

    @Override
    String getbouw() {
        return ZELFBOUW_BOUWKOSTEN;
    }
}
