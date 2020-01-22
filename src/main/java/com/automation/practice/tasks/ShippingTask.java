package com.automation.practice.tasks;

import com.automation.practice.pageobjects.ShippingPage;
import org.openqa.selenium.WebDriver;

public class ShippingTask {

    private WebDriver driver;
    private static ShippingPage shippingPage;

    public ShippingTask(WebDriver driver) {
        this.driver = driver;
        shippingPage = new ShippingPage(this.driver);
    }

    public void acceptTermsAndProceed() {
        shippingPage.iAgreeTermsCheckBox().click();
        shippingPage.proceedToCheckoutButton().click();
    }
}
