package nl.hardwin.javalearning.rest.zoeken;

import lombok.Getter;
import lombok.Setter;
import nl.hardwin.javalearning.domain.Rekening;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Setter
@Getter
public class RekeningViewModel {

    private static final String SPAAR_REKENING = "SPAAR";
    private static final String BETAAL_REKENING = "BETAAL";

    private String naam;
    private String rekeningNummer;
    private int saldo;
    private String type;

    public static RekeningViewModel toViewModel(Rekening rekening) {
        RekeningViewModel viewModel = new RekeningViewModel();
        viewModel.setNaam(rekening.getVolledigeNaam());
        return viewModel;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
