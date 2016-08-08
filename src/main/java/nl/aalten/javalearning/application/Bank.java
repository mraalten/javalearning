package nl.aalten.javalearning.application;

import nl.aalten.javalearning.Person;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Person> customers = new ArrayList<>();

    public void addCustomer(Person customer) {
        if (customer != null) {
            this.customers.add(customer);
            System.out.println("Rekening voor " + customer.getNaam() + " met saldo " + Util.formatAmount(customer.getSaldo()) + " geopend.");
            printTotalSavings();
        }
    }

    public int getTotalAmountSavings() {
        Long totalAmountSavings = 0l;
        for (Person person : customers) {
           totalAmountSavings = totalAmountSavings + person.getSaldo();
        }
        return totalAmountSavings.intValue();
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
    public void deposit(Person person, int amountToDeposit) {
        person.getBankaccount().stortGeld(amountToDeposit);
        System.out.println(person.getNaam() + " wil " + Util.formatAmount(amountToDeposit) + " storten. Nieuw saldo na storting is : " + Util.formatAmount(person.getSaldo()));
        printTotalSavings();
    }

    public void withdraw(Person person, int amountToWithdraw) {
        person.getBankaccount().geldOpnemen(amountToWithdraw);
        System.out.println(person.getNaam() + " wil " + Util.formatAmount(amountToWithdraw) + " opnemen. Nieuw saldo na opname is : " + Util.formatAmount(person.getSaldo()));
        printTotalSavings();
    }
}
