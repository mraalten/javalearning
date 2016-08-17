package nl.hardwin.javalearning;

import java.time.LocalDate;

public class Afschrift {

    private LocalDate DatumTransActie = LocalDate.now();
    private String OmschrijvingTransactie;
    private String bankRekeningNummer;
    //private int bedrag;
    //private String geldOpname;
    //private String geldStorting;


    public Afschrift(String bankRekeningNummer) {
        this.bankRekeningNummer = bankRekeningNummer;
    }


}
