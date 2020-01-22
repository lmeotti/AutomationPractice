package com.automation.practice.tasks;

import com.automation.practice.Objects.DataClientAddressPageDTO;
import com.automation.practice.pageobjects.AddressPage;
import org.openqa.selenium.WebDriver;

public class AddressTask {

    private WebDriver driver;
    private static AddressPage addressPage;

    public AddressTask(WebDriver driver) {
        this.driver = driver;
        addressPage = new AddressPage(this.driver);
    }

    public DataClientAddressPageDTO getDataClientAddressPage() {
        return DataClientAddressPageDTO.builder()
                .fullNameDelivery(addressPage.fullNameDeliveryLabel().getText())
                .fullAddressDelivery(addressPage.fullAddressDeliveryLabel().getText())
                .cityStateZipCodeDelivery(addressPage.cityStateZipCodeDeliveryLabel().getText())
                .countryDelivery(addressPage.countryDeliveryLabel().getText())
                .mobilePhoneDelivery(addressPage.mobilePhoneDeliveryLabel().getText())
                .fullNameInvoice(addressPage.fullNameInvoiceLabel().getText())
                .fullAddressInvoice(addressPage.fullAddressInvoiceLabel().getText())
                .cityStateZipCodeInvoice(addressPage.cityStateZipCodeInvoiceLabel().getText())
                .countryInvoice(addressPage.countryInvoiceLabel().getText())
                .mobilePhoneInvoice(addressPage.mobilePhoneInvoiceLabel().getText())
                .build();
    }

    public void proceedToCheckout() {
        addressPage.proceedToCheckoutButon().click();
    }
}
