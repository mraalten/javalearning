package nl.aalten.javalearning.application;

public class Util {

    private static final String EURO_TEXT = "EUR ";
    private static final String AMOUNT_SUFFIX = ",=";

    public static String formatAmount(int amount) {
        return EURO_TEXT + amount + AMOUNT_SUFFIX;
    }

}
