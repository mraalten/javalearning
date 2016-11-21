package nl.hardwin.javalearning.rest;

import nl.hardwin.javalearning.domain.Bank;
import nl.hardwin.javalearning.domain.Rekening;
import nl.hardwin.javalearning.rest.zoeken.RekeningenViewModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.time.LocalDate;
import java.util.List;

@Component
public class BankResource {
    private Bank hardwinBank = new Bank();

    private static final Logger logger = LoggerFactory.getLogger(BankResource.class);

    public BankResource() {
        logger.info("Application started. BankResource loaded");
        hardwinBank.openSpaarrekening("192295093", "Richard Aalten", LocalDate.of(1970, 4, 9), 150, 100);
        hardwinBank.openBetaalrekening("192722125", "Hedi Aalten", LocalDate.of(1974, 1, 14), 200, 150);
    }

    @GET
    @Path("/zoekenRekeningen")
    @Produces("application/json")
    public RekeningenViewModel findRekeningen(@QueryParam("rekeningNummer") String rekeningNummer) {
        if (StringUtils.isEmpty(rekeningNummer)) {
            return RekeningenViewModel.toViewModel(findAllRekeningen());
        }
        return RekeningenViewModel.toViewModel(findSpecificRekening(rekeningNummer));
    }

    private Rekening findSpecificRekening(String rekeningNummer) {
        return hardwinBank.getRekening(rekeningNummer);
    }

    private List<Rekening> findAllRekeningen() {
        return hardwinBank.getAllRekeningen();
    }

}
