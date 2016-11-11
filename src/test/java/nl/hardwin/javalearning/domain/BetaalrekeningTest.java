package nl.hardwin.javalearning.domain;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;

import org.junit.Test;

public class BetaalrekeningTest {

    @Test
    public void it_should_withdraw_since_enough_saldo() {
        Betaalrekening betaalrekening = new Betaalrekening(100, 0, new Persoon("Richard", LocalDate.of(1970, 4, 9)));
        betaalrekening.geldOpnemen(80);
        assertThat(betaalrekening.getSaldo(), is(20));
    }

    @Test
    public void it_should_withdraw_since_exactly_enough_saldo() {
        Betaalrekening betaalrekening = new Betaalrekening(100, 0, new Persoon("Richard", LocalDate.of(1970, 4, 9)));
        betaalrekening.geldOpnemen(100);
        assertThat(betaalrekening.getSaldo(), is(0));
    }

    @Test
    public void it_should_withdraw_since_not_enough_saldo_but_kredietlimiet_not_reached() {
        Betaalrekening betaalrekening = new Betaalrekening(100, 50, new Persoon("Richard", LocalDate.of(1970, 4, 9)));
        betaalrekening.geldOpnemen(140);
        assertThat(betaalrekening.getSaldo(), is(-40));
    }

    @Test
    public void it_should_withdraw_since_not_enough_saldo_but_exactly_kredietlimiet_reached() {
        Betaalrekening betaalrekening = new Betaalrekening(100, 50, new Persoon("Richard", LocalDate.of(1970, 4, 9)));
        betaalrekening.geldOpnemen(150);
        assertThat(betaalrekening.getSaldo(), is(-50));
    }

    @Test(expected = IllegalStateException.class)
    public void it_should_not_withdraw_since_enough_saldo_but__kredietlimiet_reached() {
        Betaalrekening betaalrekening = new Betaalrekening(100, 50, new Persoon("Richard", LocalDate.of(1970, 4, 9)));
        betaalrekening.geldOpnemen(160);
    }
}
