package com.automation.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;

public class CartPage {

    private static WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductName() {
        return driver.findElement(By.xpath("//*[contains(@id, 'order-detail-content')]//p[@class='product-name']//a")).getText();
    }

    public BigDecimal getProductValue() {
        return new BigDecimal(driver.findElement(By.id("total_product")).getText().substring(1));
    }

    public BigDecimal getShippingValue() {
        return new BigDecimal(driver.findElement(By.id("total_shipping")).getText().substring(1));
    }

    public WebElement proceedToCheckoutButton() {
        return driver.findElement(By.xpath("//*[@class='cart_navigation clearfix']//*[contains(@title, 'Proceed to checkout')]"));
    }
}
