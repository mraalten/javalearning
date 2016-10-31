package nl.hardwin.javalearning.domain;

public class Betaalrekening extends Rekening {

    private static final String BETAALREKENING_PREFIX = "3542";

    public Betaalrekening(int saldo, Persoon persoon) {
        super(saldo, "Ja", persoon);
    }

    @Override
    String getPrefix() {
        return BETAALREKENING_PREFIX;
    }
}
