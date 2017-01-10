package nl.hardwin.javalearning.domain;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BankTest {

    @Test
    public void it_should_open_a_betaalrekening() {
        Bank testbank = new Bank();
        String var = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);
        System.out.println(var);
        Assert.assertNotNull(var, "This object should not be null");
    }

    @Test
    public void it_should_open_a_spaarrekening() {
        Bank testbank = new Bank();
        String var = testbank.openSpaarrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);
        System.out.println(var);
        Assert.assertNotNull(var, "This object should not be null");
    }

    @Test
    public void it_should_depoit_money_to_betaalrekening(){
        Bank testbank = new Bank();
        String TestRekening = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        testbank.deposit(TestRekening, 500);

        assertThat(testbank.getSaldo(TestRekening), is(2500));
    }

    @Test
    public void it_should_withdraw_money_from_betaalrekening_to_spaarrekening(){
        Bank testbank = new Bank();
        String TestRekeningBetaalrekening = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);
        String TestRekeningSpaarrekening = testbank.openSpaarrekening("BSN112233", "Edwin Spaarrekening", LocalDate.of(1988, 6, 3), 500, 0);

        testbank.transferMoney(TestRekeningBetaalrekening, TestRekeningSpaarrekening, 200);

        assertThat(testbank.getSaldo(TestRekeningBetaalrekening), is(1800));
        assertThat(testbank.getSaldo(TestRekeningSpaarrekening), is(500));
    }

    @Test
    public void it_should_print_transacties_from_betaalrekening() {
        Bank testbank = new Bank();
        String TestRekeningBetaalrekening = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        testbank.printOverzichtTransacties(TestRekeningBetaalrekening);

    }


    }
