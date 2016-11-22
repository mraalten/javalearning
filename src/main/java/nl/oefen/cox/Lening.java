package nl.oefen.cox;

/**
 * Created by edwincox on 15-11-2016.
 */
public abstract class Lening   {
    private int bedrag;
    private int totaalAlleLeningen;

        public Lening(int bedrag) {
        this.bedrag = bedrag;
    }

    public int getBedrag() {
        return bedrag;
    }

    @Override
    public String toString() {
        return "Lening: " + getLeningOmschrijving() + " Waarde: " + getPrefix() ;

    }
    abstract String getLeningOmschrijving();

    abstract int getPrefix();


}
