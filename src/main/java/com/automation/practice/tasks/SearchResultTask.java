package com.automation.practice.tasks;

import com.automation.practice.pageobjects.SearchResultPage;
import org.openqa.selenium.WebDriver;

public class SearchResultTask {

    WebDriver driver;
    SearchResultPage searchResultPage;

    public SearchResultTask(WebDriver driver) {
        this.driver = driver;
        searchResultPage = new SearchResultPage(this.driver);
    }

    public void selectProduct(String nomeDoProduto) {
        searchResultPage.selectProductForName(nomeDoProduto);
    }
}
