package com.obilet.pages.flightfarepage;

import com.obilet.selectors.flightfarepageselectors.FlightFarePageSelectors;
import org.junit.Assert;

public class FlightFarePage {

    private final FlightFarePageSelectors flightFarePageSelectors = new FlightFarePageSelectors();

    public void checkFareDepartureOriginDestination(String origin, String destination) {
        Assert.assertEquals(origin, flightFarePageSelectors.txtFlightFareDepartureOrigin.getText());
        Assert.assertEquals(destination, flightFarePageSelectors.txtFlightFareDepartureDestination.getText());
    }

    public void checkFareReturnOriginDestination(String origin, String destination) {
        Assert.assertEquals(origin, flightFarePageSelectors.txtFlightFareReturnOrigin.getText());
        Assert.assertEquals(destination, flightFarePageSelectors.txtFlightFareReturnDestination.getText());
    }

}