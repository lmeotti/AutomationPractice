package com.automation.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {

    WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectProductForName(String nomeDoProduto) {
        driver.findElement(By.xpath(".//*[contains(@id,'center_column')]//*[contains(@class, 'product-container')]//*[contains(@title, '".concat(nomeDoProduto).concat("')]//*[contains(@itemprop, 'image')]"))).click();
    }
}
