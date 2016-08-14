package nl.aalten.javalearning.application;

import java.time.LocalDate;

public class Bankstatement{

    private LocalDate DatumTransActie = LocalDate.now();
    private String OmschrijvingTransactie;
    private String bankRekeningNummer;
    //private int bedrag;
    //private String geldOpname;
    //private String geldStorting;


    public Bankstatement(String bankRekeningNummer) {
        this.bankRekeningNummer = bankRekeningNummer;
    }


}
