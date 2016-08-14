package nl.aalten.javalearning.application;

import nl.aalten.javalearning.Person;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Person> customers = new ArrayList<>();
    private int totalAmountSavings;

    public void addCustomer(Person customer) {
        if (customer != null) {
            this.customers.add(customer);
            totalAmountSavings = totalAmountSavings + customer.getSaldo();
            System.out.println("Rekening voor " + customer.getNaam() + " met saldo " + Util.formatAmount(customer.getSaldo()) + " geopend.");
            printTotalSavings();
        }
    }

    public int getTotalAmountSavings() {
        return totalAmountSavings;
    }

    private void printTotalSavings() {
        System.out.println("Totaal saldo van spaarrekeningen is nu: " + Util.formatAmount(getTotalAmountSavings()));
    }

    /**
     * Deposit some money on the account for the provided customer.
     *
     * @param person the person to add the money to it's account
     * @param amountToDeposit the amount to deposit, should be greater than zero
     */
    public synchronized void deposit(Person person, int amountToDeposit) {
        person.getBankaccount().stortGeld(amountToDeposit);
        totalAmountSavings = totalAmountSavings + amountToDeposit;
        System.out.println(person.getNaam() + " wil " + Util.formatAmount(amountToDeposit) + " storten. Nieuw saldo na storting is : " + Util.formatAmount(person.getSaldo()));
        printTotalSavings();
    }

    public synchronized void withdraw(Person person, int amountToWithdraw) {
        person.getBankaccount().geldOpnemen(amountToWithdraw);
        totalAmountSavings = totalAmountSavings - amountToWithdraw;
        System.out.println(person.getNaam() + " wil " + Util.formatAmount(amountToWithdraw) + " opnemen. Nieuw saldo na opname is : " + Util.formatAmount(person.getSaldo()));
        printTotalSavings();
    }
}
