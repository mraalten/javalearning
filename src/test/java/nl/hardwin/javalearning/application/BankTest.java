package nl.hardwin.javalearning.application;

import nl.hardwin.javalearning.domain.Bank;
import nl.hardwin.javalearning.domain.Persoon;
import org.junit.Test;

import java.time.LocalDate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BankTest {

    @Test
    public void it_should_return_zero_when_no_accounts_are_present() {
        Bank bank = new Bank();
        assertThat(bank.getTotalAmountSavings(), is(0));
    }

    @Test
    public void it_should_return_the_correct_saldo_when_money_is_deposited_and_withdrawn() {
        Bank bank = new Bank();

        Persoon person1 = new Persoon("Fred", LocalDate.of(1984, 2, 7), "NLRABO123", 500);
        Persoon person2 = new Persoon("Wilma", LocalDate.of(1986, 5, 1), "NLINGB456", 200);
        bank.addCustomer(person1);
        bank.addCustomer(person2);
        assertThat(bank.getTotalAmountSavings(), is(700));

        bank.deposit(person1, 150);
        bank.withdraw(person2, 100);
        assertThat(bank.getTotalAmountSavings(), is(750));

    }
}