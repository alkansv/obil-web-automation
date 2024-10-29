package com.obilet.steps.signuppagesteps;

import com.obilet.base.BaseTest;
import com.obilet.pages.signuppage.SignUpPage;
import com.obilet.selectors.signuppageselectors.SignUpPageSelectors;
import com.thoughtworks.gauge.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SignUpPageStep{

    private final SignUpPage signUpPage = new SignUpPage();
    private final SignUpPageSelectors signUpPageSelectors = new SignUpPageSelectors();
    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @Step("E-mail alanına random email yazılır")
    public void setEmailStep() {
        signUpPage.setEmail();
        logger.info(signUpPageSelectors.txtSignUpEmail + " elementine text yazıldı.");
    }

    @Step("Password alanına <password> yazılır")
    public void setPasswordStep(String password) {
        signUpPage.setPassword(password);
        logger.info(signUpPageSelectors.txtSignUpPassword + " elementine text yazıldı.");
    }

    @Step("Üye ol butonuna tıklanır")
    public void clickSignUpStep() {
        signUpPage.clickSignUp();
        logger.info(signUpPageSelectors.btnSignUp + " elementine tıklandı.");
    }

}



