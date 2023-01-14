package ua.hillel.tests.StoreRestTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.rest.StoreController;
import ua.hillel.rest.entities.Orders;
import ua.hillel.rest.entities.OrdersNew;

import java.io.IOException;

public class StoreRestTests {
    @Test
    public void finedStatusInventory() throws IOException {
        StoreController storeController = new StoreController();
        storeController.finedStatusInventory();
    }

    @Test
    public void placeOrder() throws IOException {
        StoreController storeController = new StoreController();
        storeController.placeNewOrder(77);
    }

    @Test
    public void placeOrderGSON() throws IOException {
        Orders orders = new Orders();
        orders.setId(10);
        orders.setPetId(7);
        orders.setQuantity(10);
        orders.setShipDate("2023-01-14T18:19:38.901Z");
        orders.setComplete(true);
        orders.setStatus("approved");
        StoreController storeController = new StoreController();
        storeController.placeNewOrderGSON(orders);
    }

    @Test
    public void placeOrderLOMBOK() throws IOException {
        OrdersNew ordersLOMBOK = new OrdersNew();
        ordersLOMBOK.setId(10);
        ordersLOMBOK.setPetId(7);
        ordersLOMBOK.setQuantity(10);
        ordersLOMBOK.setComplete(true);
        ordersLOMBOK.setStatus("approved");
        StoreController storeController = new StoreController();
        OrdersNew checkResult = storeController.placeNewOrderLOMBOK(ordersLOMBOK);
        Assert.assertEquals(checkResult, ordersLOMBOK);
    }

    @Test
    public void finedOrder() throws IOException {
        StoreController storeController = new StoreController();
        storeController.finedOrder(2);
    }

    @Test
    public void deleteOrder() throws IOException {
        StoreController storeController = new StoreController();
        storeController.deleteOrder(1);
    }
}
