package nl.oefen.cox;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // 1 maak hypotheek dossier
        HypotheekDossier hypotheekDossier = new HypotheekDossier("Leo", LocalDate.of(1962, 6, 3), "Drabbelsweg 34");

        // 2 maak Persoon en koppel
        // 3 voeg Annuitaire lening toe
        // 4 ,,   Lineaire ,,
        Annuiteit annuiteit = new Annuiteit( 500000, 3690);
        Linear linear = new Linear(500, 78);
        hypotheekDossier.addLening(annuiteit);
        hypotheekDossier.addLening(linear);

        //Nog korter dan: Annuiteit annuiteit = new Annuiteit( 300000, 3600);
        hypotheekDossier.addLening(new Annuiteit( 300000, 3600));

        // 5 voeg Nieuwbouw-woning toe
        hypotheekDossier.addWoning(new Nieuwbouw("Goudsmidstraat 555", 686868));

        // 6 ,,   Zelfbouw-woning toe
        hypotheekDossier.addWoning(new Zelfbouw("Vlinderstraat 555", 686868));
        hypotheekDossier.addWoning(new Zelfbouw("Hoekhuis 555", 686868));

        // 7 druk de gegevens af
        // Druk persoon gegevens af:



        // Druk Lening geld totaal af:
        hypotheekDossier.gettotaalGeldBedragLeningen();

        // Druk woning af:
        //System.out.println("Tijdelijk: " + hypotheekDossier.getPersoon().getAdres());
        hypotheekDossier.printWoningGegevens();


        // Print aantal leningen
        hypotheekDossier.getAantalLeningen();

        // Print aantal woningen
        hypotheekDossier.getAantalWoningen();





    }

}
