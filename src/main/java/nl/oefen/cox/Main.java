package nl.oefen.cox;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // 1 maak hypotheek dossier
        HypotheekDossier hypotheekDossier = new HypotheekDossier();

        // 2 maak Persoon en koppel
        int idEdwin = hypotheekDossier.addPersoon("Edwin", LocalDate.of(1988, 6, 3), "Drabbelsweg 8");
        //System.out.println("id terug = " + idEdwin);

        // 3 voeg Annuitaire lening toe
        hypotheekDossier.addLening(400000, 3600);

        // 4 ,,   Lineaire ,,
        hypotheekDossier.addLineaire(250000, 3000);

        // 5 voeg Nieuwbouw-woning toe

        // 6 ,,   Zelfbouw-woning toe
        // 7 druk de gegevens af




    }

}
