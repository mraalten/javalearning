package nl.hardwin.javalearning.application;

import java.util.Random;

public class Util {

    private static final String EURO_TEXT = "EUR ";
    private static final String AMOUNT_SUFFIX = ",=";

    public static String formatAmount(int amount) {
        return EURO_TEXT + amount + AMOUNT_SUFFIX;
    }

    public static int generateNummer(int lengte) {
        Random randomGenerator = new Random();
        StringBuilder sb = new StringBuilder();
        for (int idx = 1; idx <= lengte; ++idx){
            int randomInt = randomGenerator.nextInt(10);
            sb.append(randomInt);
        }
        return Integer.parseInt(sb.toString());
    }

}
