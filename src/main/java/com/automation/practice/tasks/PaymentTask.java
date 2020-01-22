package com.automation.practice.tasks;

import com.automation.practice.Objects.ProductDetailsDTO;
import com.automation.practice.pageobjects.PaymentPage;
import org.openqa.selenium.WebDriver;

import java.math.BigDecimal;

public class PaymentTask {

    private WebDriver driver;
    private static PaymentPage paymentPage;

    public PaymentTask(WebDriver driver) {
        this.driver = driver;
        paymentPage = new PaymentPage(driver);
    }

    public BigDecimal getTotalPricePurchese() {
        return new BigDecimal(paymentPage.totalPurchesePriceLabel().getText().substring(1));
    }

    public String paymentTypeConfirmAndProductNumber() {
        paymentPage.paymentWireButton().click();
        paymentPage.confirmOrderButton().click();
       return paymentPage.orderNumber().getText().substring(216, 225);
    }

    public void goToOrders() {

        paymentPage.backOrderButton().click();
    }
}
