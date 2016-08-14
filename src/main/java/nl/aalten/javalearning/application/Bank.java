package nl.aalten.javalearning.application;

import nl.aalten.javalearning.Person;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private int BankSpaarrekening;
    private List<Person> customers = new ArrayList<>();

    public void addCustomer(Person customer) {
        if (customer != null) {
            this.customers.add(customer);
            System.out.println("Rekening voor " + customer.getNaam() + " met saldo " + Util.formatAmount(customer.getSaldo()) + " geopend.");
            getErBijTotalAmountSavings(customer.getSaldo());
            //printTotalSavings();
        }
    }

    public void getErBijTotalAmountSavings(int totaalBankSpaarrekening) {
        this.BankSpaarrekening = BankSpaarrekening + totaalBankSpaarrekening;
        System.out.println("Totaal saldo van de bank zijn eigen spaarrekeningen is nu: " + BankSpaarrekening);
    }

    public void getErAfTotalAmountSavings(int amountToWithdraw){
        this.BankSpaarrekening = BankSpaarrekening - amountToWithdraw;
        System.out.println("Totaal saldo van de bank zijn eigen spaarrekeningen is nu: " + BankSpaarrekening);
    }

    /**
     * Deposit some money on the account for the provided customer.
     *
     * @param person the person to add the money to it's account
     * @param amountToDeposit the amount to deposit, should be greater than zero
     */
    public void deposit(Person person, int amountToDeposit) {
        System.out.println(person.getNaam() + " wil " + Util.formatAmount(amountToDeposit) + " storten. Nieuw saldo na storting is : " + Util.formatAmount(person.getSaldo()));
        person.getBankaccount().stortGeld(amountToDeposit);
        getErBijTotalAmountSavings(amountToDeposit);
        //printTotalSavings();
    }

    public void withdraw(Person person, int amountToWithdraw) {
        System.out.println(person.getNaam() + " wil " + Util.formatAmount(amountToWithdraw) + " opnemen. Nieuw saldo na opname is : " + Util.formatAmount(person.getSaldo()));
        person.getBankaccount().geldOpnemen(amountToWithdraw);
        getErAfTotalAmountSavings(amountToWithdraw);
        //printTotalSavings();
    }
}
