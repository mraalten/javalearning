package nl.hardwin.javalearning.domain;

public class Betaalrekening extends Rekening {

    public Betaalrekening(String rekeningnummer, int saldo, Persoon persoon) {
        super(rekeningnummer, saldo, "Ja", persoon);
    }

}
