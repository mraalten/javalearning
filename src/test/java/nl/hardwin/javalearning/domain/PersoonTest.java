package nl.hardwin.javalearning.domain;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersoonTest {

    private static final LocalDate VALID_BIRTHDATE = LocalDate.of(1984, 2, 7);


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Test
    public void it_should_return_the_correct_age_because_no_birthday_yet() {
        Persoon person = getValidPersonObject();
        int geboorteJaar = LocalDate.now().getYear() - 15;

        person.setGeboorteDatum(LocalDate.of(geboorteJaar, 1, 1));

        assertThat(person.getLeeftijd(), is(15));
    }

    private Persoon getValidPersonObject() {
        return new Persoon("edwin", LocalDate.now());
    }

    @Test
    public void it_should_return_the_correct_age_because_today_its_your_birthday() {
        Persoon person = getValidPersonObject();
        LocalDate today = LocalDate.now();
        person.setGeboorteDatum(today.minusYears(40));
        assertThat(person.getLeeftijd(), is(40));
    }

    @Test
    public void it_should_return_the_correct_age_because_had_already_birthday() {
        Persoon person = getValidPersonObject();
        person.setGeboorteDatum(LocalDate.of(1970, 1, 1));
        assertThat(person.getLeeftijd(), is(47));
    }

    @Test
    public void it_should_return_the_correct_name(){
        Persoon persoon = new Persoon("Edwin Cox", LocalDate.of(1970, 1, 1));

        assertThat(persoon.getNaam(), is("Edwin Cox"));
    }

    @Test
    public void it_should_return_correct_name_and_birthday(){
        Persoon persoon = new Persoon("Edwin Cox", LocalDate.of(1970, 1, 1));

        assertThat(persoon.toString(), is("Naam: Edwin Cox, geb.datum: 1970-01-01"));
    }

}