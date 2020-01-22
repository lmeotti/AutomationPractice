package com.automation.practice.base;


import com.automation.practice.tasks.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;


public class BaseTests {

    protected static WebDriver driver;
    protected static IndexTask indexTask;
    protected static ViewProductTask viewProductTask;
    protected static SearchResultTask searchResultTask;
    protected static ModalProductAddedCartTask modalProductAddedCartTask;
    protected static CartTask cartTask;
    protected static AutenticationTask autenticationTask;
    protected static CreatAccountTask creatAccountTask;
    protected static AddressTask addressTask;
    protected static ShippingTask shippingTask;
    protected static PaymentTask paymentTask;
    protected static OrderHistoryTask orderHistoryTask;

    @BeforeTest
    public void setUpTests(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.navigate().to("http://www.automationpractice.com");
    }

    @AfterTest
    public void setDownTests(){
        driver.close();
    }
}
