package com.automation.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.math.BigDecimal;

public class ViewProductPage {

    private WebDriver driver;

    public ViewProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement addToCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("fancybox-iframe")));
        driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")).getAttribute("id"));
        return this.driver.findElement(By.id("add_to_cart"));
    }

    public void getValueProduct() {
        WebElement value = this.driver.findElement(By.id("our_price_display"));
        BigDecimal teste = new BigDecimal(value.getText());
    }

    public void getNameProduct() {
        WebElement name = this.driver.findElement(By.xpath("//h1[@itemprop='name']"));
        String teste = name.getText();
    }
}
