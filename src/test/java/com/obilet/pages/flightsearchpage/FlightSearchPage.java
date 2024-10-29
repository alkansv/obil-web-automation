package com.obilet.pages.flightsearchpage;

import com.obilet.selectors.flightsearchpageselectors.FlightSearchPageSelectors;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.stream.IntStream;

import static com.obilet.handlers.SeleniumHandler.*;
import static com.obilet.selectors.flightsearchpageselectors.FlightSearchPageSelectors.*;

public class FlightSearchPage {

    private final FlightSearchPageSelectors flightSearchPageSelectors = new FlightSearchPageSelectors();

    public void checkFlightSearchPage() {
        Assert.assertTrue(flightSearchPageSelectors.btnFlightSearch.isDisplayed());
    }

    public void selectFlightOrigin(String origin) {
        flightSearchPageSelectors.txtFlightOrigin.sendKeys(origin);
        clickWebElement(flightSearchPageSelectors.listFirstOrigin, 5);
    }

    public void selectFlightDestination(String destination) {
        flightSearchPageSelectors.txtFlightDestination.sendKeys(destination);
        clickWebElement(flightSearchPageSelectors.listFirstDestination, 5);
    }

    public void selectDepartureDate() {
        clickWebElement(flightSearchPageSelectors.btnFlightDepartureDate, 5);
        clickWebElement(flightSearchPageSelectors.flightSelectedDateDeparture, 5);
    }

    public void selectReturnDate() {
        waitBySeconds(2);
        clickWebElement(flightSearchPageSelectors.btnFlightReturnDate, 5);
        clickWebElement(flightSearchPageSelectors.flightSelectedDateReturn, 5);
    }

    public void clickFlightSearch() {
        clickWebElement(flightSearchPageSelectors.btnFlightSearch, 5);
    }

    public void checkMainPageMyAccount() {
        findElementWait(flightSearchPageSelectors.listFlightSearch, 30);
        Assert.assertTrue(flightSearchPageSelectors.listFlightSearch.isDisplayed());
    }

    public void checkFlightListDepartureOriginsDestinations(String origin, String destination) {
        int size = flightSearchPageSelectors.lblFlightSearchListDepartureOrigins.size();
        if (size > 10) {
            size = 10;
        }

        IntStream.range(0, size)
                .forEach(i -> {
                    Assert.assertEquals(flightSearchPageSelectors.lblFlightSearchListDepartureOrigins.get(i).getText() + " departure origin not same", origin, flightSearchPageSelectors.lblFlightSearchListDepartureOrigins.get(i).getText());
                    Assert.assertEquals(flightSearchPageSelectors.lblFlightSearchListDepartureDestinations.get(i).getText() + " departure destination not same", destination, flightSearchPageSelectors.lblFlightSearchListDepartureDestinations.get(i).getText());
                });
    }

    public void checkFlightListReturnOriginsDestinations(String origin, String destination) {
        waitBySeconds(3);
        int size = flightSearchPageSelectors.lblFlightSearchListDepartureOrigins.size();
        if (size > 10) {
            size = 10;
        }

        IntStream.range(0, size)
                .forEach(i -> {
                    Assert.assertEquals(flightSearchPageSelectors.lblFlightSearchListReturnOrigins.get(i).getText() + " return origin not same", origin, flightSearchPageSelectors.lblFlightSearchListReturnOrigins.get(i).getText());
                    Assert.assertEquals(flightSearchPageSelectors.lblFlightSearchListReturnDestinations.get(i).getText() + " return destination not same", destination, flightSearchPageSelectors.lblFlightSearchListReturnDestinations.get(i).getText());
                });
    }

    public void closeModalDialog() {
        waitBySeconds(3);
        if (isElementPresent(By.xpath(FLIGHT_SEARCH_CLOSE_BUTTON_XPATH))) {
            clickWebElement(flightSearchPageSelectors.btnFlightPopupClose, 5);
        }
    }

    public void clickFlightDepartureFirst() {
        clickWebElement(flightSearchPageSelectors.listDepartureFirstFlight, 5);
        if (isElementPresent(By.xpath(FLIGHT_SEARCH_DEPARTURE_FIRST_FLY_CONTAINER_XPATH))) {
            clickWebElement(flightSearchPageSelectors.listDepartureFirstFlightFirstPackage, 5);
        }
    }

    public void clickFlightReturnFirst() {
        clickWebElement(flightSearchPageSelectors.listReturnFirstFlight, 5);
        if (isElementPresent(By.xpath(FLIGHT_SEARCH_RETURN_FIRST_FLY_CONTAINER_XPATH))) {
            clickWebElement(flightSearchPageSelectors.listReturnFirstFlightFirstPackage, 5);
        }
    }

}