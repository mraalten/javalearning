package nl.aalten.javalearning;

import java.time.LocalDate;

public class Person {

    private String naam;
    private Adres correspondentieAdres;
    private LocalDate geboorteDatum;
    private Person partner;
    private int bankAccount;
    private int saldo;

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }


    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + ", geb.datum: " + geboorteDatum;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public String getNaam() {
        return this.naam;
    }


    public Adres getCorrespondentieAdres(){
        return this.correspondentieAdres;
    }

    public Adres setCorrespondentieAdres(Adres correspondentieAdres){
        return this.correspondentieAdres = correspondentieAdres;
    }

    /**
     * This method returns an age based on
     * @return the age
     */
    public int getLeeftijd() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int yearBirthDate = geboorteDatum.getYear();

        int monthNow = today.getMonth().getValue();
        int monthBirtDate = geboorteDatum.getMonth().getValue();

        int dayToday = today.getDayOfMonth();
        int dayBirtDate = geboorteDatum.getDayOfMonth();

        if (monthNow >= monthBirtDate) {
            if (dayToday >= dayBirtDate) {
                System.out.println("1 jaar ouder");

                int age = (year - yearBirthDate);
                return age;

            } else {
                return year - yearBirthDate;
            }

        } else {
            return year - yearBirthDate;
        }
    }

    public int getbankAccount() {
        return bankAccount;
    }

    public void setbankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void stortGeld(int stortGeld){
        System.out.println("U stort het voglende bedrag " + stortGeld);
        saldo = stortGeld + saldo;
        System.out.println("Uw saldo bedraagt nu " + saldo);
    }

    public void geldOpnemen(int geldOpnemen){
        if(saldo < 0){
            System.out.println("U kunt geen geld opnemen saldo te weinig");
        }else if (geldOpnemen > saldo){
            System.out.println("U kunt geen geld opnemen saldo te weinig");
        }else {
            System.out.println("U wilt het volgende bedrag opnemen " + geldOpnemen);
            saldo = saldo - geldOpnemen;
            System.out.println("U bedrag is nu " + saldo);
        }
    }


}
