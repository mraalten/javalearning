package nl.hardwin.javalearning;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;

import nl.hardwin.javalearning.domain.OpAfnameType;
import nl.hardwin.javalearning.domain.Persoon;
import nl.hardwin.javalearning.domain.Rekening;
import nl.hardwin.javalearning.domain.Transactie;
import org.junit.Test;

public class RekeningTest {
    private Persoon persoon = new Persoon("Test", LocalDate.now().plusYears(18));

    @Test(expected = IllegalStateException.class)
    public void it_should_do_nothing_when_money_is_withdrawn_but_saldo_is_zero() {
        Rekening bankaccount = new Rekening("121212", 0, "nee", persoon);
        bankaccount.geldOpnemen(10);
    }

    @Test(expected = IllegalStateException.class)
    public void it_should_do_nothing_when_saldo_is_too_low() {
        Rekening bankaccount = new Rekening("121212", 200, "nee", persoon);
        bankaccount.geldOpnemen(210);
    }

    @Test
    public void it_should_return_correct_saldo_when_saldo_is_sufficient() {
        Rekening bankaccount = new Rekening("121212", 150, "nee", persoon);
        bankaccount.geldOpnemen(110);
        assertThat(bankaccount.getSaldo(), is(40));
    }

    @Test
    public void it_should_return_the_correct_saldo_when_money_is_deposited() {
        Rekening bankaccount = new Rekening("121212", 150, "nee", persoon);
        bankaccount.stortGeld(50);
        assertThat(bankaccount.getSaldo(), is(200));
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_throw_an_error_when_a_negative_amount_is_deposited() {
        Rekening bankaccount = new Rekening("121212", 150, "nee", persoon);
        bankaccount.stortGeld(-10);
    }

    @Test
    public void it_should_return_printBankStatmentGeldGestort_with_positief_number(){
        Rekening bankaccount = new Rekening("223344", 8000, "nee", persoon);
        bankaccount.stortGeld(400);
    }

    @Test
    public void it_should_return_printBankStatmentGeldOpnemen_with_positief_number(){
        Rekening bankaccount = new Rekening("998877", 1250, "nee", persoon);
        bankaccount.geldOpnemen(400);
    }

    @Test
    public void it_should_contain_a_transaction_of_type_storten_when_money_is_deposited() {
        Rekening bankaccount = new Rekening("998877", 1250, "nee", persoon);
        bankaccount.stortGeld(100);

        assertThat(bankaccount.getTransacties().size(), is(1));
        Transactie transactie = bankaccount.getTransacties().get(0);
        assertThat(transactie.getOpAfname(), is(OpAfnameType.STORTEN));
    }

    @Test
    public void it_should_contain_the_right_number_of_transactions_when_money_is_deposited_or_withdrawn() {
        Rekening bankaccount = new Rekening("998877", 1250, "nee", persoon);
        bankaccount.stortGeld(100);
        bankaccount.geldOpnemen(50);
        bankaccount.geldOpnemen(25);
        bankaccount.stortGeld(30);
        assertThat(bankaccount.getTransacties().size(), is(4));
    }

    @Test
    public void it_should_contain_a_transaction_of_type_opnemen_when_money_is_withdrawn(){
        Rekening bankaccount = new Rekening("998877", 1250, "nee", persoon);
        bankaccount.geldOpnemen(100);

        assertThat(bankaccount.getTransacties().size(), is(1));
        Transactie transactie = bankaccount.getTransacties().get(0);
        assertThat(transactie.getOpAfname(), is(OpAfnameType.OPNEMEN));

    }


    @Test(expected = IllegalStateException.class)
    public void it_should_throw_an_error_when_saldo_is_zero(){
        Rekening rekening = new Rekening("4545", 0, "nee", persoon);
    }

    @Test(expected = IllegalStateException.class)
    public void it_should_throw_an_error_when_saldo_is_below_zero(){
        Rekening rekening = new Rekening("4545", -9, "nee", persoon);
    }

    @Test
    public void printTest() {
        Rekening bankaccount = new Rekening("998877", 200, "ja", persoon);
        bankaccount.geldOpnemen(500);

    }

    @Test
    public void it_should_give_a_less_amout_then_start_it(){
        Rekening bankaccount = new Rekening("998877", 5000, "ja", persoon);
        bankaccount.geldOpnemen(500);

        assertThat(bankaccount.getSaldo(), is(4500));
    }

}
