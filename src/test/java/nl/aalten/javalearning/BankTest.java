package nl.aalten.javalearning;

import nl.aalten.javalearning.application.Bank;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Created by edwincox on 13-8-2016.
 */
public class BankTest {

    @Test
    public void it_should_give_a_positief_number_back_from_BankSpaarrekening(){
        Person Testperson = new Person("Testperson", LocalDate.of(1950, 4, 9), "NLRABtest123123", 1525);
        Bank rabobank = new Bank();
        rabobank.addCustomer(Testperson);
    }

    @Test
    public void it_should_give_a_negatief_number_back_from_BankSpaarrekening(){
        Person Testperson = new Person("Testperson", LocalDate.of(1950, 4, 9), "NLRABtest123123", 1525);
        Bank rabobank = new Bank();
        rabobank.addCustomer(Testperson);
        rabobank.withdraw(Testperson, 100);
    }

}
