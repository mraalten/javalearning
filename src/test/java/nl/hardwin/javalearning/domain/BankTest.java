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
        Betaalrekening betaalrekeningEdwin = testbank.openBetaalrekening("11111111", "Edwin Test", LocalDate.of(1984, 6, 6),2000, 400);
        Assert.assertNotNull(String.valueOf(betaalrekeningEdwin), "This object should not be null");
    }

    @Test
    public void it_should_open_a_spaarrekening() {
        Bank testbank = new Bank();
        Spaarrekening spaarrekekingTest = testbank.openSpaarrekening("BSN112233", "Test Spaarrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        Assert.assertNotNull(String.valueOf(spaarrekekingTest), "This object should not be null");
    }

    @Test
        public void it_should_depoit_money_to_betaalrekening(){
        Bank testbank = new Bank();
        Betaalrekening betaalrekeningTest = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        testbank.deposit(betaalrekeningTest.getRekeningNummer(), 500);

        assertThat(betaalrekeningTest.getSaldo(), is(2500));
    }

    @Test
    public void it_should_withdraw_money_from_betaalrekening_to_spaarrekening(){
        Bank testbank = new Bank();
        Betaalrekening betaalrekeningTest = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        testbank.withdraw(betaalrekeningTest.getRekeningNummer(), 800);


        assertThat(betaalrekeningTest.getSaldo(), is(1200));
    }

    @Test
    public void it_should_print_transacties_from_betaalrekening() {
        Bank testbank = new Bank();
        Betaalrekening betaalrekeningTest = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        betaalrekeningTest.printTransactie();
    }

    @Test
    public void it_should_give_the_saldo_of_account_back(){
        Bank testbank = new Bank();
        Betaalrekening betaalrekeningTest = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);

        assertThat(betaalrekeningTest.getSaldo(), is(2000));

    }

    @Test
    public void it_should_print_the_transacties(){
        Bank testbank = new Bank();
        Betaalrekening betaalrekeningTest = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);


        testbank.printOverzichtTransacties(betaalrekeningTest.getRekeningNummer());
    }

    @Test
    public void it_should_transer_money_to_a_other_account(){
        Bank testbank = new Bank();
        Betaalrekening betaalrekeningTest1 = testbank.openBetaalrekening("BSN112233", "Edwin Betaalrekening", LocalDate.of(1988, 6, 3), 2000, 500);
        Betaalrekening betaalrekeningTest2 = testbank.openBetaalrekening("BSN787889", "test Test", LocalDate.of(1988, 6, 3), 2000, 500);

        testbank.transferMoney(betaalrekeningTest1.getRekeningNummer(), betaalrekeningTest2.getRekeningNummer(), 400);

        assertThat(betaalrekeningTest1.getSaldo(), is(1600));
        assertThat(betaalrekeningTest2.getSaldo(), is(2400));
    }

    @Test
    public void it_should_(){
        Bank testbank = new Bank();

        testbank.getAllRekeningen();
    }

    }
