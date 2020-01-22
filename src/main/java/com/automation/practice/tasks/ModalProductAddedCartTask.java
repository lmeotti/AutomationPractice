package com.automation.practice.tasks;

import com.automation.practice.pageobjects.ModalProductAddedCartPage;
import org.openqa.selenium.WebDriver;

public class ModalProductAddedCartTask {

    private WebDriver driver;
    private static ModalProductAddedCartPage modalProductAddedCartPage;

    public ModalProductAddedCartTask(WebDriver driver) {
        this.driver = driver;
        modalProductAddedCartPage = new ModalProductAddedCartPage(this.driver);
    }

    public void proceedToCheckout() {
       modalProductAddedCartPage.proceedToCheckoutButton().click();
    }
}
