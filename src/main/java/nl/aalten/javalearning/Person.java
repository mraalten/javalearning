package nl.aalten.javalearning;

import java.time.LocalDate;

public class Person {

    public static final int MINIMUM_START_SALDO = 100;

    private String naam;
    private Adres correspondentieAdres;
    private Bankaccount bankaccount;
    private LocalDate geboorteDatum;
    private Person partner;

    public Person(String naam, LocalDate geboortDatum, String rekeningNummer, int startSaldo) {
        this.naam = naam;
        if (rekeningNummer != null){
            if (startSaldo >= MINIMUM_START_SALDO){
                this.bankaccount = new Bankaccount(rekeningNummer, startSaldo);
            } else {
                throw new IllegalStateException("Minder dan 100 euro gestort, min 100 storten");
            }
        } else {
            throw new IllegalStateException("Rekeningnummer is verplicht.");
        }
    }

    public Bankaccount getBankaccount() {
        return bankaccount;
    }

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


    public String getNaam() {
        return this.naam;
    }

    public Adres getCorrespondentieAdres(){
        return correspondentieAdres;
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

        int yearBirthDate = geboorteDatum.getYear();
        int age = today.getYear() - yearBirthDate;
        LocalDate birthDateCurrentYear = LocalDate.of(today.getYear(), geboorteDatum.getMonth().getValue(), geboorteDatum.getDayOfMonth());
        if (birthDateCurrentYear.isAfter(today)) {
            return age - 1;
        }
        return age;
    }

    public int getSaldo() {
        return bankaccount.getSaldo();
    }
}