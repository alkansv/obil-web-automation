package com.obilet.selectors.signuppageselectors;

import com.obilet.handlers.SeleniumHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageSelectors extends SeleniumHandler {

    public SignUpPageSelectors() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@name='email']")
    public WebElement txtSignUpEmail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement txtSignUpPassword;

    @FindBy(xpath = "//button[@class='register register-button']")
    public WebElement btnSignUp;

}