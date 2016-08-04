package nl.aalten.javalearning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonTest {

    @Test
    public void it_should_return_the_correct_age_because_no_birthday_yet() {
        Person person = new Person();
        person.setGeboorteDatum(LocalDate.of(1970, 12, 31));

        assertThat(person.getLeeftijd(), is(45));
    }

    @Test
    public void it_should_return_the_correct_age_because_today_its_your_birthday() {
        Person person = new Person();
        LocalDate today = LocalDate.now();
        person.setGeboorteDatum(today.minusYears(40));
        assertThat(person.getLeeftijd(), is(40));
    }

    @Test
    public void it_should_return_the_correct_age_because_had_already_birthday() {
        Person person = new Person();
        person.setGeboorteDatum(LocalDate.of(1970, 1, 1));
        assertThat(person.getLeeftijd(), is(46));
    }

    @Test(expected = IllegalStateException.class)
    public void it_should_do_nothing_when_saldo_is_zero() {
        Person person = new Person();
        person.geldOpnemen(10);
    }

    @Test(expected = IllegalStateException.class)
    public void it_should_do_nothing_when_saldo_is_too_low() {
        Person person = new Person();
        person.setSaldo(9);
        person.geldOpnemen(10);
    }

    @Test
    public void it_should_return_correct_saldo_when_saldo_is_sufficient() {
        Person person = new Person();
        person.setSaldo(20);
        person.geldOpnemen(10);
        assertThat(person.getSaldo(), is(10));
    }

    @Test
    public void it_should_return_the_correct_saldo_when_money_is_deposited() {
        Person person = new Person();
        person.setSaldo(20);
        person.stortGeld(10);
        assertThat(person.getSaldo(), is(30));
    }
}