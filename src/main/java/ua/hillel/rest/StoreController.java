package ua.hillel.rest;

import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import ua.hillel.rest.entities.Orders;
import ua.hillel.rest.entities.OrdersNew;

import java.io.IOException;

public class StoreController {
    public void finedStatusInventory() throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://petstore3.swagger.io/api/v3/store/inventory")
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

    public void placeNewOrder(int petId) throws IOException {
        JSONObject object = new JSONObject();
        object.put("id", 10);
        object.put("petId", petId);
        object.put("quantity", 10);
        object.put("shipDate", "2023-01-14T18:19:38.901Z");
        object.put("status", "approved");
        object.put("complete", true);
        RequestBody body = RequestBody.create(object.toString(), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore3.swagger.io/api/v3/store/order")
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        JSONObject responceObject = new JSONObject(response.body().string());
        System.out.println(response.code());
        System.out.printf("id = %d; petId =%d; quantity=%d; shipDate=%s; status=%s; complete=%s",
                responceObject.get("id"),
                responceObject.get("petId"),
                responceObject.get("quantity"),
                responceObject.get("shipDate"),
                responceObject.get("status"),
                responceObject.get("complete"));
    }

    public void placeNewOrderGSON(Orders orders) throws IOException {
        Gson gson = new Gson();
        RequestBody body = RequestBody.create(gson.toJson(orders), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore3.swagger.io/api/v3/store/order")
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        Orders newOrders = gson.fromJson(response.body().string(), Orders.class);
        System.out.println(newOrders);
    }

    public OrdersNew placeNewOrderLOMBOK(OrdersNew orders) throws IOException {
        Gson gson = new Gson();
        RequestBody body = RequestBody.create(gson.toJson(orders), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore3.swagger.io/api/v3/store/order")
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        OrdersNew newOrders = gson.fromJson(response.body().string(), OrdersNew.class);
        System.out.println(newOrders);
        return newOrders;
    }

    public void finedOrder(int orderId) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://petstore3.swagger.io/api/v3/store/order/" + orderId)
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

    public void deleteOrder(int orderId) throws IOException {
        Request request = new Request.Builder()
                .delete()
                .url("https://petstore3.swagger.io/api/v3/store/order/" + orderId)
                .build();
        OkHttpClient okHttpClient = new OkHttpClient();
        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.headers());
    }
}
