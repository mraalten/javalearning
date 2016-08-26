package nl.hardwin.javalearning.application;

import nl.hardwin.javalearning.domain.Bank;
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

    @Test(expected = IllegalStateException.class)
    public void it_should_return_a_IllegalStateException_by_rekening_null(){
        Bank bank = new Bank();
        bank.openRekening("Edwin Cox", LocalDate.of(1984, 06, 06), 1200);
        bank.deposit(null, 400);
    }

    @Test
    public void it_should_return_the_correct_saldo_when_money_is_deposited_and_withdrawn() {
        Bank bank = new Bank();
        String rekeningNrEdwin = bank.openRekening("Edwin Cox", LocalDate.of(1984, 06, 06), 1200);
        bank.deposit(rekeningNrEdwin, 150);
        assertThat(bank.getTotalAmountSavings(), is(1350));

        String rekeningNrRichard = bank.openRekening("Richard Aalten", LocalDate.of(1970, 12, 31), 1100);
        bank.withdraw(rekeningNrRichard, 100);
        assertThat(bank.getTotalAmountSavings(), is(2350));
    }
}