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
        hypotheekDossier.addNieuwbouw("Goudsmidstraat 2", 950000);

        // 6 ,,   Zelfbouw-woning toe
        hypotheekDossier.addZelfbouw("Flapperstraat 77", 222000 );

        // 7 druk de gegevens af

        System.out.println(hypotheekDossier.getPersoon().getNaam());
        System.out.println(hypotheekDossier.getPersoon().getAdres());
        System.out.println(hypotheekDossier.getPersoon().getGeboorteDatum());

        System.out.println(hypotheekDossier.);


    }

}
