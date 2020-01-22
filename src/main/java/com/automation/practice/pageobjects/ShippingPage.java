package com.automation.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingPage {

    private static WebDriver driver;

    public ShippingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement iAgreeTermsCheckBox() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.elementToBeClickable(By.id("uniform-cgv")));
    }

    public WebElement proceedToCheckoutButton() {
        return driver.findElement(By.name("processCarrier"));
    }
}
