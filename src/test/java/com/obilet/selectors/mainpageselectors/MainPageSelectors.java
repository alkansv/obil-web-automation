package com.obilet.selectors.mainpageselectors;

import com.obilet.handlers.SeleniumHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageSelectors extends SeleniumHandler {

    public MainPageSelectors() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//*[@class='login']")
    public WebElement btnMainPageSignIn;

    @FindBy(xpath = "//*[@data-event-action='Flight']")
    public WebElement btnMainPageFlight;

    @FindBy(xpath = ".//*[@class='sign-up login-to-register']")
    public WebElement btnMainPageSignUp;

    @FindBy(xpath = "//*[@class='user-name']")
    public WebElement btnMainPageMyAccount;

}