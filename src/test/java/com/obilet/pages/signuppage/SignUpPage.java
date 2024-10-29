package com.obilet.pages.signuppage;

import com.obilet.selectors.signuppageselectors.SignUpPageSelectors;

import static com.obilet.handlers.SeleniumHandler.randomNumber;


public class SignUpPage {

    private final SignUpPageSelectors signUpPageSelectors = new SignUpPageSelectors();


    public void setEmail() {
        String randomNumber = randomNumber(6);
        signUpPageSelectors.txtSignUpEmail.sendKeys("automation" + randomNumber + "@gmail.com");
    }

    public void setPassword(String password) {
        signUpPageSelectors.txtSignUpPassword.sendKeys(password);
    }

    public void clickSignUp() {
        signUpPageSelectors.btnSignUp.click();
    }

}