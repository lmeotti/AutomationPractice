package com.automation.practice.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class DataClientAddressPageDTO {

    private String fullNameDelivery;
    private String fullAddressDelivery;
    private String cityStateZipCodeDelivery;
    private String countryDelivery;
    private String mobilePhoneDelivery;
    private String fullNameInvoice;
    private String fullAddressInvoice;
    private String cityStateZipCodeInvoice;
    private String countryInvoice;
    private String mobilePhoneInvoice;
}
