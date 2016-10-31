package nl.hardwin.javalearning.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import nl.hardwin.javalearning.domain.Bank;
import nl.hardwin.javalearning.domain.MyRekening;
import nl.hardwin.javalearning.domain.Rekening;
import nl.hardwin.javalearning.rest.zoeken.RekeningenViewModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BankResource {
    private Bank hardwinBank = new Bank();

    private static final Logger logger = LoggerFactory.getLogger(BankResource.class);

    public BankResource() {
        logger.info("Application started. BankResource loaded");
    }

    @GET
    @Path("/zoekenRekeningen")
    @Produces("application/json")
    public RekeningenViewModel findRekeningen(@QueryParam("rekeningNummer") String rekeningNummer) {
        Rekening rekening = hardwinBank.getRekening(rekeningNummer);
        RekeningenViewModel rekeningenViewModel = new RekeningenViewModel();
        MyRekening myRekening = new MyRekening("Richard");
        rekeningenViewModel.addMyRekening(myRekening);
        return rekeningenViewModel;
    }

    //        Spaarrekening rekening = new Spaarrekening(100, new Persoon("Richard Aalten", LocalDate.of(1970, 4, 9)));
    //        rekeningenViewModel.addRekening(rekening);
//    public List<Produkt> getProdukten(@QueryParam("produktGroepId") Integer produktGroepId) {
//        return repository.getProdukten(produktGroepId);
//    }

//    @POST
//    @Path("/toevoegenproduktWinkelwagen")
//    @Consumes("application/json")
//    public void toevoegenProdukt(Produkt produkt) {
//        repository.toevoegenProduktAanBoodschappenlijst(produkt.getId());
//    }


}
