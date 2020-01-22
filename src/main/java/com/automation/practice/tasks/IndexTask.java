package com.automation.practice.tasks;

import com.automation.practice.pageobjects.IndexPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class IndexTask {

    private WebDriver driver;
    private static IndexPage indexPage;

    public IndexTask(WebDriver driver) {
        this.driver = driver;
        indexPage = new IndexPage(this.driver);
    }

    public void searchProduct(String nomeProduto) {
        indexPage.SearchTextBox().click();
        indexPage.SearchTextBox().sendKeys(nomeProduto);
        indexPage.SearchTextBox().sendKeys(Keys.ENTER);
    }
}
