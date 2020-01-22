package com.automation.practice.tasks;

import com.automation.practice.Objects.ProductDetailsDTO;
import com.automation.practice.pageobjects.CartPage;
import org.openqa.selenium.WebDriver;

public class CartTask {

    private WebDriver driver;
    private static CartPage cartPage;

    public CartTask(WebDriver driver) {
        this.driver = driver;
        cartPage = new CartPage(this.driver);
    }

    public ProductDetailsDTO getProductDetails(){
        return ProductDetailsDTO.builder()
                .nameProduct(cartPage.getProductName())
                .valueProduct(cartPage.getProductValue())
                .shippingValueProduct(cartPage.getShippingValue())
                .build()
        ;
    }

    public void proceedToCheckout() {
        cartPage.proceedToCheckoutButton().click();
    }
}
