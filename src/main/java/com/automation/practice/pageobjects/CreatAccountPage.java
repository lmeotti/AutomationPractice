package com.automation.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatAccountPage {

    private static WebDriver driver;

    public CreatAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement firstNameTextBox () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));
    }
    public WebElement lastNameTextBox () {
        return driver.findElement(By.id("customer_lastname"));
    }

    public WebElement passwordTextBox () {
        return driver.findElement(By.id("passwd"));
    }

    public WebElement firstNameAddressTextBox () {
        return driver.findElement(By.id("firstname"));
    }

    public WebElement lastNameAddressTextBox () {
        return driver.findElement(By.id("lastname"));
    }

    public WebElement addressTextBox () {
        return driver.findElement(By.id("address1"));
    }

    public WebElement cityTextBox() {
        return driver.findElement(By.id("city"));
    }

    public Select stateSelect() {
        return new Select(driver.findElement(By.id("id_state")));
    }

    public WebElement zipCodeTextBox () {
        return driver.findElement(By.id("postcode"));
    }

    public Select coutrySelect() {
        return new Select(driver.findElement(By.id("id_country")));
    }

    public WebElement mobilePhoneTextBox () {
        return driver.findElement(By.id("phone_mobile"));
    }

    public WebElement addressNameTextBox () {
        return driver.findElement(By.id("alias"));
    }

    public WebElement submitAccountButton() {
        return driver.findElement(By.id("submitAccount"));
    }
}
