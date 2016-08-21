package nl.hardwin.javalearning;

import nl.hardwin.javalearning.domain.OpAfnameType;
import nl.hardwin.javalearning.domain.Transactie;
import org.junit.Test;

import java.math.BigDecimal;


public class TransactieTest {

    @Test(expected = IllegalStateException.class)
    public void it_should_return_(){
       Transactie transactie = new Transactie("test", new BigDecimal(0), OpAfnameType.valueOf("STORTEN"));
       transactie.addTransactie("test", new BigDecimal(0), OpAfnameType.valueOf("STORTEN"));
        transactie.printTransactie();

    }



}
