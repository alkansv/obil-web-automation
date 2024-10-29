package com.obilet.base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.obilet.handlers.SeleniumHandler;


public class BaseTest extends SeleniumHandler {

    @BeforeScenario
    public void setUp() {
        runWebDriver();
        navigateToMainPage();
    }

    @AfterScenario
    public void tearDown() {
        webDriver.quit();
    }

}
