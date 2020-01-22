package com.automation.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutenticationPage {

    private static WebDriver driver;

    public AutenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement emailAdressTexBox() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_create")));
    }

    public WebElement submitCreateButton() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitCreate")));
    }
}
