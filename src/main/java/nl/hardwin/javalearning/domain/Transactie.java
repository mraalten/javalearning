package nl.hardwin.javalearning.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transactie {

    private LocalDate datum;
    private String omschrijving;
    private BigDecimal bedrag;
    private OpAfnameType opAfname;

    public Transactie(String omschrijving, BigDecimal bedrag, OpAfnameType opAfname) {
        this.datum = LocalDate.now();
        this.omschrijving = omschrijving;
        this.bedrag = bedrag;
        this.opAfname = opAfname;
    }


    public LocalDate getDatum() {
        return datum;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public BigDecimal getBedrag() {
        return bedrag;
    }

    public OpAfnameType getOpAfname() {
        return opAfname;
    }
}
