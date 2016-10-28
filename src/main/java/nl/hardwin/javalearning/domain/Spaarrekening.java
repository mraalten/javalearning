package nl.hardwin.javalearning.domain;

public class Spaarrekening extends Rekening {

    public Spaarrekening(String rekeningnummer, int saldo, Persoon persoon) {
        super(rekeningnummer, saldo, "Nee", persoon);
    }

}


