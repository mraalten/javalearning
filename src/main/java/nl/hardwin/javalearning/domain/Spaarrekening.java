package nl.hardwin.javalearning.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Spaarrekening extends Rekening {

    private static final String SPAARREKENING_PREFIX = "3177";

    public Spaarrekening(int saldo, int kredietlimiet, Persoon persoon) {
        super(saldo, kredietlimiet, persoon);
    }



    @Override
    String getPrefix() {
        return SPAARREKENING_PREFIX;
    }

}


