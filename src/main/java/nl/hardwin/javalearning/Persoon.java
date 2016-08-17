package nl.hardwin.javalearning;

import java.time.LocalDate;

public class Persoon {

    public static final int MINIMUM_START_SALDO = 100;

    private String naam;
    private Adres correspondentieAdres;
    private Rekening bankaccount;
    private LocalDate geboorteDatum;
    private Persoon partner;

    public Persoon(String naam, LocalDate geboortDatum, String rekeningNummer, int startSaldo) {
        this.naam = naam;
        this.geboorteDatum = geboortDatum;
        if (rekeningNummer != null){
            if (startSaldo >= MINIMUM_START_SALDO){
                this.bankaccount = new Rekening(rekeningNummer, startSaldo);
            } else {
                throw new IllegalStateException("Minder dan 100 euro gestort, min 100 storten");
            }
        } else {
            throw new IllegalStateException("Rekeningnummer is verplicht.");
        }
    }

    public Rekening getBankaccount() {
        return bankaccount;
    }

    public Persoon getPartner() {
        return partner;
    }

    public void setPartner(Persoon partner) {
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