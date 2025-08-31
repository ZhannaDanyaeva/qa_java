package ru.yandex.praktikum.order;

import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;
import ru.yandex.praktikum.Client;

import java.util.Map;

public class OrderClient extends Client {

    @Step("Создать заказ")
    public ValidatableResponse createOrder(Order order) {
        return spec()
                .body(order)
                .when()
                .post("/orders")
                .then().log().all();
    }

    @Step("Получить список заказов")
    public ValidatableResponse getOrders() {
        return spec()
                .when()
                .get("/orders")
                .then().log().all();
    }

    @Step("Отменить заказ")
    public ValidatableResponse cancelOrder(int track) {
        return spec()
                .body(Map.of("track", track))
                .when()
                .put("/orders/cancel")
                .then().log().all();
    }
}
