package nl.hardwin.javalearning.domain;

import nl.hardwin.javalearning.application.Util;

public class BankPas {

    private static final int LENGTE_BANKPAS_NUMMER = 4;
    private int nummer;
    private int pincode;

    public BankPas() {
        nummer = Util.generateNummer(LENGTE_BANKPAS_NUMMER);
    }



}
