package nl.hardwin.javalearning.rest.zoeken;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import nl.hardwin.javalearning.domain.Rekening;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RekeningenViewModel {

    @XmlElement
    private List<RekeningViewModel> rekeningen = new ArrayList<>();

    public void addRekening(RekeningViewModel rekeningenViewModel) {
        rekeningen.add(rekeningenViewModel);
    }

    public static RekeningenViewModel toViewModel(Rekening rekening) {
        RekeningenViewModel viewModel = new RekeningenViewModel();
        viewModel.addRekening(RekeningViewModel.toViewModel(rekening));
        return viewModel;
    }

    public static RekeningenViewModel toViewModel(List<Rekening> rekeningen) {
        RekeningenViewModel viewModel = new RekeningenViewModel();
        for (Rekening rekening : rekeningen) {
            viewModel.addRekening(RekeningViewModel.toViewModel(rekening));
        }
        return viewModel;
    }
}
