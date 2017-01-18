package nl.hardwin.javalearning.rest.zoeken;

import nl.hardwin.javalearning.domain.Rekening;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class RekeningViewModel {

    private static final String SPAAR_REKENING = "SPAAR";
    private static final String BETAAL_REKENING = "BETAAL";

    private String naam;
    private String rekeningNummer;
    private int saldo;
    private String type;

    public static RekeningViewModel toViewModel(Rekening rekening) {
        RekeningViewModel viewModel = new RekeningViewModel();
        viewModel.setRekeningNummer(rekening.getRekeningNummer());
        viewModel.setNaam(rekening.getVolledigeNaam());
        viewModel.setSaldo(rekening.getSaldo());
        return viewModel;
    }

    public String getNaam() {
        return naam;
    }

    public String getRekeningNummer() {
        return rekeningNummer;
    }

    public void setRekeningNummer(String rekeningNummer) {
        this.rekeningNummer = rekeningNummer;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
