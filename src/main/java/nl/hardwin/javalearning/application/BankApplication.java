package nl.hardwin.javalearning.application;

import nl.hardwin.javalearning.domain.Bank;
import nl.hardwin.javalearning.domain.Betaalrekening;

import java.time.LocalDate;

public class BankApplication {
    private static Bank rabobank = new Bank();

    public static void main(String[] args) {

        //rabobank.openBetaalrekening("5623452345", "Edwin Cox", LocalDate.of(1984, 6, 6),2000, 400);

        //rabobank.openSpaarrekening("5623452345", "Nicolette Cox", LocalDate.of(1984, 6, 18),4500, 250);


        Betaalrekening betaalrekeningEdwin = rabobank.openBetaalrekening("5623452345", "Edwin Cox", LocalDate.of(1984, 6, 6),2000, 400);
        betaalrekeningEdwin.getSaldo();



    }

    private static void printTotalSavings() {
        System.out.println("Totaal saldo van spaarrekeningen op de Rabobank is nu: " + Util.formatAmount(rabobank.getTotalAmountSavings()));
    }

}
