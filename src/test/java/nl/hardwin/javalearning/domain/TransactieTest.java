package nl.hardwin.javalearning.domain;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransactieTest {

    @Test
    public void it_should_have_the_correct_values_when_the_object_is_created() {
        BigDecimal bedrag = new BigDecimal(150.75);
        Transactie transactie = new Transactie("unit-test", bedrag, OpAfnameType.STORTEN);
        assertThat(transactie.getDatum(), is(LocalDate.now()));
        assertThat(transactie.getOmschrijving(), is("unit-test"));
        assertThat(transactie.getBedrag(), is(bedrag));
        assertThat(transactie.getOpAfname(), is(OpAfnameType.STORTEN));
    }




}
