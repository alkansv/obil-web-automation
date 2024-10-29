package com.obilet.steps.flightfsearchpagesteps;

import com.obilet.base.BaseTest;
import com.obilet.pages.flightsearchpage.FlightSearchPage;
import com.obilet.selectors.flightsearchpageselectors.FlightSearchPageSelectors;
import com.thoughtworks.gauge.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FlightSearchPageStep{
    private final FlightSearchPage flightPage = new FlightSearchPage();
    private final FlightSearchPageSelectors flightSearchPageSelectors = new FlightSearchPageSelectors();
    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @Step("Uçak arama sayfasının açıldığı kontrol edilir")
    public void checkFlightSearchPageStep() {
        flightPage.checkFlightSearchPage();
        logger.info(flightSearchPageSelectors.btnFlightSearch + " elementi görüldü");
    }

    @Step("Kalkış lokasyonu <origin> seçilir")
    public void selectFlightOriginStep(String origin) {
        flightPage.selectFlightOrigin(origin);
        logger.info(flightSearchPageSelectors.txtFlightOrigin + " elementinden seçim yapıldı");
    }

    @Step("Varış lokasyonu <destination> seçilir")
    public void selectFlightDestinationStep(String destination) {
        flightPage.selectFlightDestination(destination);
        logger.info(flightSearchPageSelectors.txtFlightDestination + " elementinden seçim yapıldı");
    }

    @Step("Gidiş tarihi gelecek ayın sondan bir önceki günü seçilir")
    public void selectDepartureDateStep() {
        flightPage.selectDepartureDate();
        logger.info(flightSearchPageSelectors.btnFlightDepartureDate + " elementinden seçim yapıldı");
    }

    @Step("Dönüş tarihi gelecek ayın son günü seçilir")
    public void selectReturnDateStep() {
        flightPage.selectReturnDate();
        logger.info(flightSearchPageSelectors.btnFlightReturnDate + " elementinden seçim yapıldı");
    }

    @Step("Uçak ara butonuna tıklanır")
    public void clickFlightSearchStep() {
        flightPage.clickFlightSearch();
        logger.info(flightSearchPageSelectors.btnFlightSearch + " elementine tıklandı");
    }


    @Step("Uçak listesinin göründüğü kontrol edilir")
    public void checkMainPageMyAccountStep() {
        flightPage.checkMainPageMyAccount();
        logger.info(flightSearchPageSelectors.listFlightSearch + " elementi görüldü");
    }

    @Step("Listedeki gidiş yönündeki kalkış ve varış uçuşlarının <origin> <destination> olduğunu kontrol et")
    public void checkFlightListDepartureOriginsDestinationsStep(String origin, String destination) {
        flightPage.checkFlightListDepartureOriginsDestinations(origin, destination);
    }

    @Step("Listedeki dönüş yönündeki kalkış ve varış uçuşlarının <origin> <destination> olduğunu kontrol et")
    public void checkFlightListReturnOriginsDestinationsStep(String origin, String destination) {
        flightPage.checkFlightListReturnOriginsDestinations(origin, destination);
    }

    @Step("Pop up açılırsa kapat butonuna tıklanır")
    public void closeModalDialogStep() {
        flightPage.closeModalDialog();
    }

    @Step("Gidiş için ilk uçuş ve varsa ilk sınıf seçilir")
    public void clickFlightDepartureFirstStep() {
        flightPage.clickFlightDepartureFirst();
        logger.info(flightSearchPageSelectors.listDepartureFirstFlight + " elementine tıklandı");
    }

    @Step("Dönüş için ilk uçuş ve varsa ilk sınıf seçilir")
    public void clickFlightReturnFirstStep() {
        flightPage.clickFlightReturnFirst();
        logger.info(flightSearchPageSelectors.listReturnFirstFlight + " elementine tıklandı");
    }
}


