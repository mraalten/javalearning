package nl.hardwin.javalearning.domain;

import org.junit.Test;

import java.time.LocalDate;

/**
 * Created by edwincox on 10-1-2017.
 */
public class SpaarrekeningTest {

    @Test
    public void it_should_create_a_spaarrekeing(){
        Spaarrekening spaarrekening = new Spaarrekening(400, 0, new Persoon("Edwin Spaarrekening", LocalDate.of(1988, 3, 6)));
    }
}
