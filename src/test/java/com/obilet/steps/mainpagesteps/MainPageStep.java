package com.obilet.steps.mainpagesteps;

import com.obilet.base.BaseTest;
import com.obilet.pages.mainpage.MainPage;
import com.obilet.selectors.mainpageselectors.MainPageSelectors;
import com.thoughtworks.gauge.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainPageStep  {
    private final MainPage mainPage = new MainPage();
    private final MainPageSelectors mainPageSelectors = new MainPageSelectors();
    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @Step("Anasayfanın açıldığı kontrol edilir")
    public void checkMainPageStep() {
        mainPage.checkMainPage();
        logger.info(mainPageSelectors.btnMainPageFlight + " elementi görüldü");
    }

    @Step("Anasayfa üzerindeki Üye Girişi butonuna tıklanır")
    public void clickMainPageSignInStep() {
        mainPage.clickMainPageSignIn();
        logger.info(mainPageSelectors.btnMainPageSignIn + " elementine tıklandı");
    }

    @Step("Üye girişi sayfasında Üye Ol butonuna tıklanır")
    public void clickMainPageSignUpStep() {
        mainPage.clickMainPageSignUp();
        logger.info(mainPageSelectors.btnMainPageSignUp + " elementine tıklandı");
    }

    @Step("Hesabım butonunun görünürlüğü kontrol edilir")
    public void checkMainPagMyAccountStep() {
        mainPage.checkMainPagMyAccount();
        logger.info(mainPageSelectors.btnMainPageMyAccount + " elementi görüldü");
    }

    @Step("Uçak butonuna tıklanır")
    public void clickMainPageFlight() {
        mainPage.clickMainPageFlight();
        logger.info(mainPageSelectors.btnMainPageFlight + " elementine tıklandı");
    }

}


