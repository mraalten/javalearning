package nl.oefen.cox;


import java.time.LocalDate;

public class Main {
    private static HypotheekDossier hypotheekDossier = new HypotheekDossier();
    public static void main(String[] args) {

        hypotheekDossier.addLening("Edwin", LocalDate.of(1988, 6, 3), "Drabbelsweg 8");


    }
}
