package com.automation.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.math.BigDecimal;

public class PaymentPage {

    private static WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement paymentWireButton() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='HOOK_PAYMENT']//*[contains(@class, 'bankwire')]")));
    }

    public WebElement totalPurchesePriceLabel() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(By.id("total_price")));
    }

    public WebElement confirmOrderButton() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='cart_navigation']//*[contains(@type, 'submit')]")));
    }

    public WebElement backOrderButton() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='cart_navigation exclusive']//*[contains(@title, 'Back to orders')]")));
    }

    public WebElement orderNumber() {
        return driver.findElement(By.className("box"));
    }
}
