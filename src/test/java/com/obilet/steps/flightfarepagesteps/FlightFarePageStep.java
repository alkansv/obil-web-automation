package com.obilet.steps.flightfarepagesteps;

import com.obilet.base.BaseTest;
import com.obilet.pages.flightfarepage.FlightFarePage;
import com.obilet.selectors.flightfarepageselectors.FlightFarePageSelectors;
import com.thoughtworks.gauge.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FlightFarePageStep {
    private final FlightFarePage flightFarePage = new FlightFarePage();
    private final FlightFarePageSelectors flightFarePageSelectors = new FlightFarePageSelectors();
    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @Step("Gidiş kalkış ve varış lokasyonunun <origin> <destination> olduğu kontrol edilir")
    public void checkFareDepartureOriginDestinationStep(String origin, String destination) {
        flightFarePage.checkFareDepartureOriginDestination(origin, destination);
        logger.info(flightFarePageSelectors.txtFlightFareDepartureOrigin + " element içeriği kontrol edildi");
    }

    @Step("Dönüş kalkış ve varış lokasyonunun <origin> <destination> olduğu kontrol edilir")
    public void checkFareReturnOriginDestinationStep(String origin, String destination) {
        flightFarePage.checkFareReturnOriginDestination(origin, destination);
        logger.info(flightFarePageSelectors.txtFlightFareReturnOrigin + " element içeriği kontrol edildi");
    }
}


