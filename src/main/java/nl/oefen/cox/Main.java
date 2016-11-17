package nl.oefen.cox;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // 1 maak hypotheek dossier
        // 2 maak Persoon en koppel
        // 3 voeg Annuitaire lening toe
        // 4 ,,   Lineaire ,,
        // 5 voeg Nieuwbouw-woning toe
        // 6 ,,   Zelfbouw-woning toe
        // 7 druk de gegevens af
        HypotheekDossier hypotheekDossier = new HypotheekDossier();
        Lening lening = new Lening(123);
        hypotheekDossier.addLening("Edwin", LocalDate.of(1988, 6, 3), "Drabbelsweg 8");


    }

}
