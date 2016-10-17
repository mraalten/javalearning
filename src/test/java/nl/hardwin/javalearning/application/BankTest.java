package nl.hardwin.javalearning.application;

import nl.hardwin.javalearning.domain.Bank;

import nl.hardwin.javalearning.domain.Persoon;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BankTest {
   


    @Test
    public void it_should_create_a_new_person_when_it_is_null(){
       Bank rabobank = new Bank();
       rabobank.openRekening("BSNtest", "Edwin", LocalDate.of(1984, 06, 06), 1200, "ja");
       Persoon persoon = rabobank.findperson("BSNtest");
       assertThat(persoon.getNaam(), is("Edwin"));
    //   assertThat(persoon.getLeeftijd(), is("32"));
   }

    @Test
    public void it_should_return_zero_when_no_accounts_are_present() {
        Bank bank = new Bank();
        assertThat(bank.getTotalAmountSavings(), is(0));
    }

    @Test
    public void it_should_return_the_correct_saldo_when_money_is_deposited_and_withdrawn() {
        Bank bank = new Bank();
        String rekeningNrEdwin = bank.openRekening("BSNtest", "Edwin Cox", LocalDate.of(1984, 06, 06), 1200, "ja");
        bank.deposit(rekeningNrEdwin, 150);
        assertThat(bank.getTotalAmountSavings(), is(1350));

        String rekeningNrRichard = bank.openRekening("BSNtest", "Richard Aalten", LocalDate.of(1970, 12, 31), 1100, "ja");
        bank.withdraw(rekeningNrRichard, 100);
        assertThat(bank.getTotalAmountSavings(), is(2350));
    }

    @Test
    public void it_should_return_saldo_from_account_with_change_amout(){
        Bank bank = new Bank();
        String rekeningNrEdwin = bank.openRekening("BSNtest", "Edwin Cox", LocalDate.of(1984, 06, 06), 200, "ja");
        String rekeningNrRichard = bank.openRekening("BSNtest", "Richard Aalten", LocalDate.of(1970, 12, 31), 200, "ja");
        bank.transfermoney(rekeningNrEdwin, rekeningNrRichard, 100);

        assertThat(bank.watIsMijnSaldo(rekeningNrEdwin), is(100));
        assertThat(bank.watIsMijnSaldo(rekeningNrRichard), is(300));
    }

    @Test (expected = IllegalStateException.class)
    public void it_should_return_a_error_because_account_nummber_ont_exit(){
        Bank bank = new Bank();
        bank.openRekening("BSNtest", "Edwin Cox", LocalDate.of(1984, 06, 06), 200, "ja");
        bank.withdraw("NLHDWN00000000", 500);
    }

    @Test
    public void it_should_print_transaction_view(){
        Bank bank = new Bank();
        String rekeningNrEdwin = bank.openRekening("BSNtest", "Edwin Cox", LocalDate.of(1984, 06, 06), 200, "ja");
        bank.printOverzichtTransacties(rekeningNrEdwin);
    }
}