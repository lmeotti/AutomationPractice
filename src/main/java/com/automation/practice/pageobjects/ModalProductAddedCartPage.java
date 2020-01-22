package com.automation.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalProductAddedCartPage {

    private static WebDriver driver;

    public ModalProductAddedCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement proceedToCheckoutButton() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button-container']//*[contains(@title, 'Proceed to checkout')]")));
    }
}
