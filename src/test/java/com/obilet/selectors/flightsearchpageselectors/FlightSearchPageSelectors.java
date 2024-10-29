package com.obilet.selectors.flightsearchpageselectors;

import com.obilet.handlers.SeleniumHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightSearchPageSelectors extends SeleniumHandler {

    public FlightSearchPageSelectors() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "origin-input")
    public WebElement txtFlightOrigin;

    @FindBy(id = "destination-input")
    public WebElement txtFlightDestination;

    @FindBy(xpath = "(//*[@id='origin']//li)[3]")
    public WebElement listFirstOrigin;

    @FindBy(xpath = "(//*[@id='destination']//li)[3]")
    public WebElement listFirstDestination;

    @FindBy(id = "departure")
    public WebElement btnFlightDepartureDate;

    @FindBy(xpath = "(//*[@id='return-input-placeholder'])")
    public WebElement btnFlightReturnDate;

    @FindBy(xpath = "(//table//tbody//tr//td//button)[last()-1]")
    public WebElement flightSelectedDateDeparture;

    @FindBy(xpath = "(//table//tbody//tr//td//button)[last()]")
    public WebElement flightSelectedDateReturn;

    @FindBy(id = "search-button")
    public WebElement btnFlightSearch;

    @FindBy(id = "outbound-journeys")
    public WebElement listFlightSearch;

    @FindBy(xpath = "(//*[@id='outbound-journeys']//li)[1]")
    public WebElement listDepartureFirstFlight;

    @FindBy(xpath = "(//*[@class='fly-container'])[1]")
    public WebElement listDepartureFirstFlightFirstPackage;

    @FindBy(xpath = "(//*[@id='return-journeys']//li)[1]")
    public WebElement listReturnFirstFlight;

    @FindBy(xpath = "((//*[@id='return-journeys'])//div[@class='fly-container'])[1]")
    public WebElement listReturnFirstFlightFirstPackage;

    @FindBy(xpath = "(//div[contains(@id,'close-button')])[1]")
    public WebElement btnFlightPopupClose;

    @FindBy(xpath = "//*[@class='flight-origin']//*[@class='airport']")
    public List<WebElement> lblFlightSearchListDepartureOrigins;

    @FindBy(xpath = "//*[@class='flight-arrival']//*[@class='airport']")
    public List<WebElement> lblFlightSearchListDepartureDestinations;

    @FindBy(xpath = "//*[@id='return-journeys']//*[@class='flight-origin']//*[@class='airport']")
    public List<WebElement> lblFlightSearchListReturnOrigins;

    @FindBy(xpath = "//*[@id='return-journeys']//*[@class='flight-arrival']//*[@class='airport']")
    public List<WebElement> lblFlightSearchListReturnDestinations;

    public static final String FLIGHT_SEARCH_CLOSE_BUTTON_XPATH = "(//div[contains(@id,'close-button')])[1]";
    public static final String FLIGHT_SEARCH_DEPARTURE_FIRST_FLY_CONTAINER_XPATH = "(//*[@class='fly-container'])[1]";
    public static final String FLIGHT_SEARCH_RETURN_FIRST_FLY_CONTAINER_XPATH = "((//*[@id='return-journeys'])//div[@class='fly-container'])[1]";

}