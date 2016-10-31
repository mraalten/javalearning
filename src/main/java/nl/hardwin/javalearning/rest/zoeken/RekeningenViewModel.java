package nl.hardwin.javalearning.rest.zoeken;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import nl.hardwin.javalearning.domain.MyRekening;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RekeningenViewModel {

    @XmlElement
    private List<MyRekening> rekeningen = new ArrayList<>();

    public void addMyRekening(MyRekening myRekening) {
        rekeningen.add(myRekening);
    }
//    public void addRekening(Rekening rekening) {
//        if (rekening != null) {
//            rekeningen.add(rekening);
//        }
//    }
}
