package nl.oefen.cox;

/**
 * Created by edwincox on 18-11-2016.
 */
public class Nieuwbouw extends Woning {

    protected int koopsom ;

    public Nieuwbouw(String straatnaam, int koopsom) {
        super(straatnaam);
        this.koopsom = koopsom;
    }


}
