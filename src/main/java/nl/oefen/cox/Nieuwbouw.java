package nl.oefen.cox;

/**
 * Created by edwincox on 18-11-2016.
 */
public class Nieuwbouw extends Woning {

    protected int koopsom ;
    public static final String NIEUWEBOUW_KOOPSOM = "Nieuwbouw";


    public Nieuwbouw(String straatnaam, int koopsom) {
        super(straatnaam);
        this.koopsom = koopsom;
    }

    public int getKoopsom() {
        return koopsom;
    }

    @Override
    int getPrefix() {
        return koopsom;
    }

    @Override
    String getbouw() {
        return NIEUWEBOUW_KOOPSOM;
    }
}
