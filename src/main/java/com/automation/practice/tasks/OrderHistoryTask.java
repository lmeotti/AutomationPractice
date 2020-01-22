package com.automation.practice.tasks;

import com.automation.practice.Objects.OrderHistoryDTO;
import com.automation.practice.pageobjects.OrderHistoryPage;
import org.openqa.selenium.WebDriver;

public class OrderHistoryTask {

    private WebDriver driver;
    private static OrderHistoryPage orderHistoryPage;

    public OrderHistoryTask(WebDriver driver) {
        this.driver = driver;
        orderHistoryPage = new OrderHistoryPage(this.driver);
    }

    public OrderHistoryDTO getOrderDetails() {
        return OrderHistoryDTO.builder()
                .orderNumber(orderHistoryPage.orderNumber().getText())
                .statusOrder(orderHistoryPage.statusOrder().getText())
                .build();
    }
}
