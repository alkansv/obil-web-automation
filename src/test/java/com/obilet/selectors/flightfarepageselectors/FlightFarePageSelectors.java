package com.obilet.selectors.flightfarepageselectors;

import com.obilet.handlers.SeleniumHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightFarePageSelectors extends SeleniumHandler {

    public FlightFarePageSelectors() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "(//*[@class='origin'])[1]")
    public WebElement txtFlightFareDepartureOrigin;

    @FindBy(xpath = "(//*[@class='destination'])[1]")
    public WebElement txtFlightFareDepartureDestination;

    @FindBy(xpath = "(//*[@class='origin'])[2]")
    public WebElement txtFlightFareReturnOrigin;

    @FindBy(xpath = "(//*[@class='destination'])[2]")
    public WebElement txtFlightFareReturnDestination;

}