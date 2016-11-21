package nl.hardwin.javalearning.domain;

import java.math.BigDecimal;

public class Betaalrekening extends Rekening {

    private BankPas bankPas = new BankPas();

    private static final String BETAALREKENING_PREFIX = "3542";
    private int saldo;


    public Betaalrekening(int saldo, int kredietLimiet, Persoon persoon) {
        super(saldo, kredietLimiet, persoon);
    }

    @Override
    String getPrefix() {
        return BETAALREKENING_PREFIX;
    }

    public void stortGeld(int stortGeld){
        if (stortGeld < 0) {
            throw new IllegalArgumentException("U kunt geen negatief bedrag storten");
        }
        saldo = stortGeld + saldo;
        Transactie transactie = new Transactie("Storting", new BigDecimal(stortGeld), OpAfnameType.STORTEN);
        transacties.add(transactie);
    }

    public void geldOpnemen(int bedrag) {
        if (onvoldoendeSaldoEnKredietlimietBereikt(bedrag)) {
            throw new IllegalStateException("Onvoldoende saldo en kredietlimiet bereikt");
        }
        saldo = saldo - bedrag;
        Transactie transactie = new Transactie("Opname", new BigDecimal(bedrag), OpAfnameType.OPNEMEN);
        transacties.add(transactie);
    }





}
