package nl.aalten.javalearning;

import java.util.Date;

public class BerekenGeboortedatum extends Person {

    private Date datum ;

    @Override
    public String toString(){
        String person = super.toString();
                return "Geboortedatum" + this.datum+ " " + person;
    }



    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }





}