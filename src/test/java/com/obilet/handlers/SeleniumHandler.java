package com.obilet.handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.SecureRandom;
import java.time.Duration;
import java.util.Locale;

public class SeleniumHandler {

    protected static WebDriver webDriver;
    protected static WebDriverWait webDriverWait;
    private static final ConfigHandler configReader = new ConfigHandler();
    private static final long ONE_SECOND = 1000L;

    public static final SecureRandom random = new SecureRandom();

    public void runWebDriver() {
        selectBrowserType();
    }

    public void navigateToMainPage() {
        waitBySeconds(5);
        webDriver.get(configReader.getEnvironments(configReader.getEnvironment()).get("urlMain"));
    }

    public static void clickWebElement(WebElement element, int timeout) {
        new WebDriverWait(webDriver, Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void findElementWait(WebElement element, int timeout) {
        new WebDriverWait(webDriver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
        element.isDisplayed();
    }

    public static void waitBySeconds(int seconds) {
        try {
            Thread.sleep(seconds * ONE_SECOND);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AssertionError(e);
        }
    }

    public static boolean isElementPresent(By by) {
        try {
            webDriver.findElement(by);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public static String randomNumber(int stringLength) {
        char[] chars = "123456789".toCharArray();
        StringBuilder stringRandom = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {
            stringRandom.append(chars[random.nextInt(chars.length)]);
        }
        return stringRandom.toString();
    }

    private void selectBrowserType() {

        long implicitTimeout = configReader.getImplicitTimeout();

        switch (configReader.getBrowserType().toLowerCase(Locale.ROOT)) {
            case "chrome" -> {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments(configReader.getChromeProperties());
                webDriver = new ChromeDriver(chromeOptions);
                webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTimeout));
            }
            case "firefox" -> {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setProfile(configReader.getFirefoxProperties());
                webDriver = new FirefoxDriver(firefoxOptions);
                webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(implicitTimeout));
                if (configReader.getFirefoxProperties().getBooleanPreference("maximize", true)) {
                    webDriver.manage().window().maximize();
                }
            }
        }

        webDriverWait = new WebDriverWait(webDriver, Duration.ofMillis(implicitTimeout));
    }
}