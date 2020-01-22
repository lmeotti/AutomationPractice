package com.automation.practice.tasks;

import com.automation.practice.pageobjects.AutenticationPage;
import org.openqa.selenium.WebDriver;

public class AutenticationTask {

    private WebDriver driver;
    private AutenticationPage autenticationPage;

    public AutenticationTask(WebDriver driver) {
        this.driver = driver;
        autenticationPage = new AutenticationPage(this.driver);
    }

    public void createInitialRegister(String email) {
        autenticationPage.emailAdressTexBox().sendKeys(email);
        autenticationPage.submitCreateButton().click();
    }
}
