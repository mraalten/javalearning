package nl.aalten.javalearning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonTest {

    private static final LocalDate VALID_BIRTHDATE = LocalDate.of(1984, 2, 7);

    @Test(expected = IllegalStateException.class)
    public void it_should_throw_an_error_when_saldo_is_zero(){
        Person person = new Person("Fred", VALID_BIRTHDATE, "4545", 0);
    }

    @Test(expected = IllegalStateException.class)
    public void it_should_throw_an_error_when_saldo_is_below_zero(){
        Person person = new Person("Fred", VALID_BIRTHDATE, "4545", -9);
    }

    @Test(expected = IllegalStateException.class)
    public void it_should_throw_an_error_when_there_is_no_accountnumber(){
        Person person = new Person("Fred", VALID_BIRTHDATE, null, 2);
    }

    @Test
    public void it_should_create_a_person_object_when_all_values_are_ok() {
        Person person = new Person("Fred", VALID_BIRTHDATE, "NLRABO0354236564", 200);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Test
    public void it_should_return_the_correct_age_because_no_birthday_yet() {
        Person person = getValidPersonObject();
        person.setGeboorteDatum(LocalDate.of(1970, 12, 31));

        assertThat(person.getLeeftijd(), is(45));
    }

    private Person getValidPersonObject() {
        return new Person("edwin", LocalDate.now(), "12345", 100);
    }

    @Test
    public void it_should_return_the_correct_age_because_today_its_your_birthday() {
        Person person = getValidPersonObject();
        LocalDate today = LocalDate.now();
        person.setGeboorteDatum(today.minusYears(40));
        assertThat(person.getLeeftijd(), is(40));
    }

    @Test
    public void it_should_return_the_correct_age_because_had_already_birthday() {
        Person person = getValidPersonObject();
        person.setGeboorteDatum(LocalDate.of(1970, 1, 1));
        assertThat(person.getLeeftijd(), is(46));
    }


}