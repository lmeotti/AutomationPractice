package com.automation.practice.Objects;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor

public class ProductDetailsDTO {

    private BigDecimal valueProduct;
    private BigDecimal shippingValueProduct;
    private String nameProduct;
}
