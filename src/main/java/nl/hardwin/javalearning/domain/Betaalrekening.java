package nl.hardwin.javalearning.domain;

public class Betaalrekening extends Rekening {

    private BankPas bankPas = new BankPas();

    private static final String BETAALREKENING_PREFIX = "3542";

    public Betaalrekening(int saldo, int kredietLimiet, Persoon persoon) {
        super(saldo, kredietLimiet, persoon);
    }

    @Override
    String getPrefix() {
        return BETAALREKENING_PREFIX;
    }
}
