package com.automation.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPage {

    private static WebDriver driver;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement fullNameDeliveryLabel() {
        return driver.findElement(By.xpath("//*[@id='address_delivery']//*[contains(@class, 'address_firstname address_lastname')]"));
    }

    public WebElement fullAddressDeliveryLabel() {
        return driver.findElement(By.xpath("//*[@id='address_delivery']//*[contains(@class, 'address_address1 address_address2')]"));
    }

    public WebElement cityStateZipCodeDeliveryLabel() {
        return driver.findElement(By.xpath("//*[@id='address_delivery']//*[contains(@class, 'address_city address_state_name address_postcode')]"));
    }

    public WebElement countryDeliveryLabel() {
        return driver.findElement(By.xpath("//*[@id='address_delivery']//*[contains(@class, 'address_country_name')]"));
    }

    public WebElement mobilePhoneDeliveryLabel() {
        return driver.findElement(By.xpath("//*[@id='address_delivery']//*[contains(@class, 'address_phone_mobile')]"));
    }

    public WebElement fullNameInvoiceLabel() {
        return driver.findElement(By.xpath("//*[@id='address_invoice']//*[contains(@class, 'address_firstname address_lastname')]"));
    }

    public WebElement fullAddressInvoiceLabel() {
        return driver.findElement(By.xpath("//*[@id='address_invoice']//*[contains(@class, 'address_address1 address_address2')]"));
    }

    public WebElement cityStateZipCodeInvoiceLabel() {
        return driver.findElement(By.xpath("//*[@id='address_invoice']//*[contains(@class, 'address_city address_state_name address_postcode')]"));
    }

    public WebElement countryInvoiceLabel() {
        return driver.findElement(By.xpath("//*[@id='address_invoice']//*[contains(@class, 'address_country_name')]"));
    }

    public WebElement mobilePhoneInvoiceLabel() {
        return driver.findElement(By.xpath("//*[@id='address_invoice']//*[contains(@class, 'address_phone_mobile')]"));
    }

    public WebElement proceedToCheckoutButon() {
        return driver.findElement(By.name("processAddress"));
    }
}
