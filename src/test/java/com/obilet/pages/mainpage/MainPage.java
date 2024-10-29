package com.obilet.pages.mainpage;

import com.obilet.selectors.mainpageselectors.MainPageSelectors;
import org.junit.Assert;

import static com.obilet.handlers.SeleniumHandler.clickWebElement;

public class MainPage {

    private final MainPageSelectors mainPageSelectors = new MainPageSelectors();


    public void checkMainPage() {
        Assert.assertTrue(mainPageSelectors.btnMainPageFlight.isDisplayed());
    }

    public void clickMainPageSignIn() {
        clickWebElement(mainPageSelectors.btnMainPageSignIn, 5);
    }

    public void clickMainPageSignUp() {
        clickWebElement(mainPageSelectors.btnMainPageSignUp, 5);
    }

    public void checkMainPagMyAccount() {
        Assert.assertTrue(mainPageSelectors.btnMainPageMyAccount.isDisplayed());
    }

    public void clickMainPageFlight() {
        clickWebElement(mainPageSelectors.btnMainPageFlight, 5);
    }

}