package com.automation.practice.tasks;

import com.automation.practice.Objects.DataClientDTO;
import com.automation.practice.pageobjects.CreatAccountPage;
import org.openqa.selenium.WebDriver;

public class CreatAccountTask {

    private WebDriver driver;
    private static CreatAccountPage creatAccountPage;

    public CreatAccountTask(WebDriver driver) {
        this.driver = driver;
        creatAccountPage = new CreatAccountPage(this.driver);
    }

    public void fillTheForm(DataClientDTO dataClientDTO) {
        creatAccountPage.firstNameTextBox().sendKeys(dataClientDTO.getFirstName());
        creatAccountPage.lastNameTextBox().sendKeys(dataClientDTO.getLastName());
        creatAccountPage.passwordTextBox().sendKeys(dataClientDTO.getPassword());
        creatAccountPage.addressTextBox().sendKeys(dataClientDTO.getAddress());
        creatAccountPage.cityTextBox().sendKeys(dataClientDTO.getCity());
        creatAccountPage.stateSelect().selectByVisibleText(dataClientDTO.getState());
        creatAccountPage.zipCodeTextBox().sendKeys(dataClientDTO.getZipCode());
        creatAccountPage.coutrySelect().selectByVisibleText(dataClientDTO.getCountry());
        creatAccountPage.mobilePhoneTextBox().sendKeys(dataClientDTO.getMobilePhone());

        creatAccountPage.addressNameTextBox().clear();
        creatAccountPage.addressNameTextBox().sendKeys(dataClientDTO.getAddressName());

        creatAccountPage.submitAccountButton().click();
    }
}
