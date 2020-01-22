package com.automation.practice.tasks;

import com.automation.practice.pageobjects.ViewProductPage;
import org.openqa.selenium.WebDriver;

public class ViewProductTask {

    private WebDriver driver;
    private ViewProductPage viewProductPage;

    public ViewProductTask(WebDriver driver) {
        this.driver = driver;
        viewProductPage = new ViewProductPage(this.driver);
    }

    public void addProductToCart(){
        viewProductPage.addToCartButton().click();
    }
}
