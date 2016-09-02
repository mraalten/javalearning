package nl.hardwin.javalearning.application;

import nl.hardwin.javalearning.domain.Adres;
import nl.hardwin.javalearning.domain.Bank;
import nl.hardwin.javalearning.domain.FactuurAdres;

import java.time.LocalDate;

public class BankApplication {
    private static Bank rabobank = new Bank();

    public static void main(String[] args) {


        String rekeningNrRichard = rabobank.openRekening("BSN1212", "Richard", LocalDate.of(1970, 4, 9), 150);
        rabobank.deposit(rekeningNrRichard, 175);

        String rekeningNrEdwin = rabobank.openRekening("Edwin", LocalDate.of(1984, 7, 2), 150);
        rabobank.withdraw(rekeningNrEdwin, 75);
        printTotalSavings();

    }

    private static void printTotalSavings() {
        System.out.println("Totaal saldo van spaarrekeningen is nu: " + Util.formatAmount(rabobank.getTotalAmountSavings()));
    }

    private static Adres adresCreate(String straatnaam, String Huisnummer, String HuisnummerToevoeging, String postcode, String Woonplaats){
        Adres adres  = new Adres();
        adres.setStraatnaam(straatnaam);
        adres.setHuisnummer(Huisnummer);
        adres.setHuisnummerToevoeging(HuisnummerToevoeging);
        adres.setPostcode(postcode);
        adres.setWoonplaats(Woonplaats);
        return adres;
    }

    private static FactuurAdres correspondentieCreate(String straatnaam, String huisnummer, String huisnummertoevoeging, String postcode, String postbus, String woonplaats){
        FactuurAdres correspondentieAdres = new FactuurAdres();
        correspondentieAdres.setStraatnaam(straatnaam);
        correspondentieAdres.setHuisnummer(huisnummer);
        correspondentieAdres.setHuisnummerToevoeging(huisnummertoevoeging);
        correspondentieAdres.setPostcode(postcode);
        correspondentieAdres.setPostbus(postbus);
        correspondentieAdres.setWoonplaats(woonplaats);
        return correspondentieAdres;

    }
}
