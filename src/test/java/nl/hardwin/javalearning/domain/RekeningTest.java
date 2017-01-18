package nl.hardwin.javalearning.domain;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RekeningTest {
    private Persoon persoon = new Persoon("Test", LocalDate.now().plusYears(18));

    @Test(expected = IllegalStateException.class)
    public void it_should_do_nothing_when_money_is_withdrawn_but_saldo_is_zero(){
        Bank rabobank = new Bank();
        rabobank.openBetaalrekening("BSN998877", "Test Rekening Test",LocalDate.of(1988, 6, 3), 0, 500);
        rabobank.withdraw("BSN998877", 200);

    }

    @Test
    public void set_should_return_a_bankaccount_number_what_number_does_not_matter(){
        Bank testbank = new Bank();
        Betaalrekening betaalrekeningTest1 = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        betaalrekeningTest1.getRekeningNummer();

        assertThat(betaalrekeningTest1.getRekeningNummer(), is("NLHDWN0354201918"));
    }

    @Test
    public void set_should_return_bankaccount_with_account_number_saldo(){
        Bank testbank = new Bank();
        Betaalrekening betaalrekeningTest1 = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        assertThat(betaalrekeningTest1.toString(), is("NLHDWN0354201918"));
    }



//
//    @Test(expected = IllegalStateException.class)
//    public void it_should_throw_an_exception_when_money_is_withdrawn_and_saldo_is_too_low() {
//        Bank rabobank = new Bank();
//        String rekeningNrTest =  rabobank.openBetaalrekening("BSN998877", "Test Rekening Test",LocalDate.of(1988, 6, 3), 200, 500);
//        rabobank.withdraw(rekeningNrTest, 710);
//    }
//
    @Test
    public void it_should_return_correct_saldo_when_saldo_is_sufficient() {
        Bank rabobank = new Bank();
        Betaalrekening betaalrekeningTest1 = rabobank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        assertThat(betaalrekeningTest1.getSaldo(), is(2000));
    }

    @Test
    public void it_should_return_the_correct_saldo_when_money_is_deposited() {
        Bank rabobank = new Bank();
        Betaalrekening betaalrekeningTest1 = rabobank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        rabobank.deposit(betaalrekeningTest1.getRekeningNummer(), 2000);

        assertThat(betaalrekeningTest1.getSaldo(), is(4000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_do_nothing_when_money_is_deposited_minus() {
        Bank rabobank = new Bank();
        Betaalrekening betaalrekeningTest1 = rabobank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        rabobank.deposit(betaalrekeningTest1.getRekeningNummer(), -2000);
    }

    @Test
    public void it_should_deposit_money_to_my_account(){
        Bank rabobank = new Bank();
        Betaalrekening betaalrekeningTest1 = rabobank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        rabobank.deposit(betaalrekeningTest1.getRekeningNummer(), 250);

        assertThat(betaalrekeningTest1.getSaldo(), is(2250));
    }

    @Test
    public void it_should_return_printBankStatmentGeldGestort_with_positief_number(){
        Bank rabobank = new Bank();
        Betaalrekening betaalrekeningTest1 = rabobank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        betaalrekeningTest1.stortGeld(400);

        betaalrekeningTest1.printTransactie();
        assertThat(betaalrekeningTest1.getTransacties().size(), is(1));
    }



    @Test
    public void it_should_contain_a_transaction_of_type_storten_when_money_is_deposited() {
        Bank rabobank = new Bank();
        Betaalrekening betaalrekeningTest1 = rabobank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        betaalrekeningTest1.stortGeld(100);
        Transactie transactie = betaalrekeningTest1.getTransacties().get(0);

        assertThat(betaalrekeningTest1.getTransacties().size(), is(2));
        assertThat(transactie.getOpAfname(), is(OpAfnameType.STORTEN));
    }


    @Test
    public void it_should_contain_the_right_number_of_transactions_when_money_is_deposited_or_withdrawn() {
        Bank rabobank = new Bank();
        Betaalrekening betaalrekeningTest1 = rabobank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        betaalrekeningTest1.stortGeld(100);
        betaalrekeningTest1.geldOpnemen(50);
        betaalrekeningTest1.geldOpnemen(25);
        betaalrekeningTest1.stortGeld(30);

        assertThat(betaalrekeningTest1.getTransacties().size(), is(4));
    }

    @Test
    public void it_should_contain_a_transaction_of_type_opnemen_when_money_is_withdrawn(){
        Bank rabobank = new Bank();
        Betaalrekening betaalrekeningTest1 = rabobank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        rabobank.withdraw(betaalrekeningTest1.getRekeningNummer(), 100);
        Transactie transactie = betaalrekeningTest1.getTransacties().get(0);

        assertThat(betaalrekeningTest1.getTransacties().size(), is(1));
        assertThat(transactie.getOpAfname(), is(OpAfnameType.OPNEMEN));
    }

    @Test
    public void It_should_stortGeld_to_a_account(){
        Bank rabobank = new Bank();
        Betaalrekening betaalrekeningTest1 = rabobank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        betaalrekeningTest1.stortGeld(250);

        assertThat(betaalrekeningTest1.getSaldo(), is(2250));

    }

    @Test
    public void it_should_give_a_less_amout_then_start_it(){
        Bank rabobank = new Bank();
        Betaalrekening betaalrekeningTest1 = rabobank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        betaalrekeningTest1.geldOpnemen(500);

        assertThat(betaalrekeningTest1.getSaldo(), is(1500));
    }

}
