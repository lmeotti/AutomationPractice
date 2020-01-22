package com.automation.practice.tests;

import com.automation.practice.Helpers.RandomUtil;
import com.automation.practice.Objects.DataClientAddressPageDTO;
import com.automation.practice.Objects.DataClientDTO;
import com.automation.practice.Objects.OrderHistoryDTO;
import com.automation.practice.Objects.ProductDetailsDTO;
import com.automation.practice.base.BaseTests;
import com.automation.practice.tasks.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.Assert.*;


public class ComprarProdutoTest extends BaseTests {

    @BeforeTest
    public void setUp(){
        indexTask = new IndexTask(driver);
        searchResultTask = new SearchResultTask(driver);
        viewProductTask = new ViewProductTask(driver);
        modalProductAddedCartTask = new ModalProductAddedCartTask(driver);
        cartTask = new CartTask(driver);
        autenticationTask = new AutenticationTask(driver);
        creatAccountTask = new CreatAccountTask(driver);
        addressTask = new AddressTask(driver);
        shippingTask = new ShippingTask(driver);
        paymentTask = new PaymentTask(driver);
        orderHistoryTask = new OrderHistoryTask(driver);
    }

    @Test
    public void ComprarProdutoTest() {

        DataClientDTO dataClientDTO = DataClientDTO.builder()
                    .email(RandomUtil.email())
                    .firstName("Lucas")
                    .lastName("Meotti")
                    .password("teste123")
                    .address("Estrada Vila Maria, 342")
                    .city("Porto Alegre")
                    .state("Texas")
                    .zipCode("91920")
                    .country("United States")
                    .mobilePhone("51998989898")
                    .addressName("meu endereço")
                .build();

        indexTask.searchProduct("Faded Short Sleeve T-shirts");
        searchResultTask.selectProduct("Faded Short Sleeve T-shirts");
        viewProductTask.addProductToCart();
        modalProductAddedCartTask.proceedToCheckout();

        ProductDetailsDTO productDetailsDTO = cartTask.getProductDetails();
        assertEquals("Faded Short Sleeve T-shirts", productDetailsDTO.getNameProduct());
        cartTask.proceedToCheckout();

        autenticationTask.createInitialRegister(dataClientDTO.getEmail());
        creatAccountTask.fillTheForm(dataClientDTO);

        DataClientAddressPageDTO dataClientAddressPageDTO = addressTask.getDataClientAddressPage();
        assertEquals(dataClientDTO.getFirstName().concat(" ").concat(dataClientDTO.getLastName()), dataClientAddressPageDTO.getFullNameDelivery());
        assertEquals(dataClientDTO.getFirstName().concat(" ").concat(dataClientDTO.getLastName()), dataClientAddressPageDTO.getFullNameInvoice());
        assertEquals(dataClientDTO.getAddress(), dataClientAddressPageDTO.getFullAddressDelivery());
        assertEquals(dataClientDTO.getAddress(), dataClientAddressPageDTO.getFullAddressInvoice());
        assertEquals(dataClientDTO.getCity().concat(", ").concat(dataClientDTO.getState()).concat(" ").concat(dataClientDTO.getZipCode()), dataClientAddressPageDTO.getCityStateZipCodeDelivery());
        assertEquals(dataClientDTO.getCity().concat(", ").concat(dataClientDTO.getState()).concat(" ").concat(dataClientDTO.getZipCode()), dataClientAddressPageDTO.getCityStateZipCodeInvoice());
        assertEquals(dataClientDTO.getCountry(), dataClientAddressPageDTO.getCountryDelivery());
        assertEquals(dataClientDTO.getCountry(), dataClientAddressPageDTO.getCountryInvoice());
        assertEquals(dataClientDTO.getMobilePhone(), dataClientAddressPageDTO.getMobilePhoneDelivery());
        assertEquals(dataClientDTO.getMobilePhone(), dataClientAddressPageDTO.getMobilePhoneInvoice());
        addressTask.proceedToCheckout();

        shippingTask.acceptTermsAndProceed();

        BigDecimal totalProduct = productDetailsDTO.getValueProduct().add(productDetailsDTO.getShippingValueProduct());
        assertEquals(totalProduct, paymentTask.getTotalPricePurchese());

        String productNumber = paymentTask.paymentTypeConfirmAndProductNumber();

        paymentTask.goToOrders();

        OrderHistoryDTO orderDetails = orderHistoryTask.getOrderDetails();
        assertEquals(productNumber, orderDetails.getOrderNumber());
        assertEquals("On backorder", orderDetails.getStatusOrder());

    }
}
