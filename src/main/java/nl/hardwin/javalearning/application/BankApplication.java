package nl.hardwin.javalearning.application;

import java.time.LocalDate;

import nl.hardwin.javalearning.domain.Bank;

public class BankApplication {
    private static Bank rabobank = new Bank();

    public static void main(String[] args) {

//        String rekeningNrRichard = rabobank.openRekening("BSN1212", "Richard", LocalDate.of(1970, 4, 9), 150, "ja");
//        rabobank.deposit(rekeningNrRichard, 175);
//        rabobank.printOverzichtTransacties(rekeningNrRichard);
//        rabobank.withdraw(rekeningNrRichard, 500);
//        rabobank.printOverzichtTransacties(rekeningNrRichard);
//        rabobank.getSaldo(rekeningNrRichard);
//        rabobank.withdraw(rekeningNrRichard, 425);
//        rabobank.getSaldo(rekeningNrRichard);

        String spaarrekeningNrEdwin = rabobank.openSpaarrekening("BSN997766", "Edwin Spaar", LocalDate.of(1988, 6, 3), 1500, 0);
        rabobank.getSpaarSaldo(spaarrekeningNrEdwin);
        System.out.println(rabobank.getSpaarSaldo(spaarrekeningNrEdwin));


//        String rekeningNrEdwin = rabobank.openRekening("BSN2626","Edwin", LocalDate.of(1984, 7, 2), 150, "nee");
//        rabobank.withdraw(rekeningNrEdwin, 75);
//        rabobank.deposit(rekeningNrEdwin, 2300);
//        rabobank.printOverzichtTransacties(rekeningNrEdwin);
//        rabobank.getSaldo(rekeningNrEdwin);
//
//        printTotalSavings();
//        rabobank.transferMoney(rekeningNrEdwin, rekeningNrRichard, 25);
//        rabobank.printOverzichtTransacties(rekeningNrEdwin);
//
//        printTotalSavings();
    }

    private static void printTotalSavings() {
        System.out.println("Totaal saldo van spaarrekeningen op de Rabobank is nu: " + Util.formatAmount(rabobank.getTotalAmountSavings()));
    }

}
