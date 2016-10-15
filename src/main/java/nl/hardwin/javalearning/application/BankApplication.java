package nl.hardwin.javalearning.application;

import nl.hardwin.javalearning.domain.Bank;

import java.time.LocalDate;

public class BankApplication {
    private static Bank rabobank = new Bank();

    public static void main(String[] args) {

        String rekeningNrRichard = rabobank.openRekening("BSN1212", "Richard", LocalDate.of(1970, 4, 9), 150, "ja");
        rabobank.deposit(rekeningNrRichard, 175);
        rabobank.printOverzichtTransacties(rekeningNrRichard);
        rabobank.withdraw(rekeningNrRichard, 500);
        rabobank.printOverzichtTransacties(rekeningNrRichard);
        rabobank.watIsMijnSaldo(rekeningNrRichard);
        rabobank.withdraw(rekeningNrRichard, 425);
        rabobank.watIsMijnSaldo(rekeningNrRichard);

        String rekeningNrEdwin = rabobank.openRekening("BSN2626","Edwin", LocalDate.of(1984, 7, 2), 150, "nee");
        rabobank.withdraw(rekeningNrEdwin, 75);
        rabobank.deposit(rekeningNrEdwin, 2300);
        rabobank.printOverzichtTransacties(rekeningNrEdwin);
        rabobank.watIsMijnSaldo(rekeningNrEdwin);

        printTotalSavings();
        rabobank.transfermoney(rekeningNrEdwin, rekeningNrRichard, 25);
        rabobank.printOverzichtTransacties(rekeningNrEdwin);

        printTotalSavings();
    }

    private static void printTotalSavings() {
        System.out.println("Totaal saldo van spaarrekeningen op de Rabobank is nu: " + Util.formatAmount(rabobank.getTotalAmountSavings()));
    }

}
