package com.example.projecttest;

import com.example.projecttest.controllers.ProductController;
import com.example.projecttest.models.Product;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class InventoryApplication extends javafx.application.Application {
    private static Stage primaryStage;
    private static Stack<String> sceneStackStr;
    public static ArrayList<Product> products = new ArrayList<>();

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = new Stage();
        sceneStackStr = new Stack<>();
        openLogin();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void back() throws IOException {
        sceneStackStr.pop();
        String toReInit = sceneStackStr.pop();
        open(toReInit);
    }

    public static void unbackable() {
        sceneStackStr.pop();
    }

    private static FXMLLoader open(String fxmlName) throws IOException {
        FXMLLoader fxmlLoader = getLoader(fxmlName);
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setScene(scene);
        primaryStage.show();

        sceneStackStr.push(fxmlName);
        sceneStackStr.forEach(s -> System.out.print(s + ", "));
        System.out.println();

        return fxmlLoader;
    }

    private static FXMLLoader getLoader(String fxmlName) {
        return new FXMLLoader(InventoryApplication.class.getResource(fxmlName));
    }

    public static void openLogin() throws IOException {
        open("login.fxml");
    }

    public static void openSignUp() throws IOException {
        open("sign-up.fxml");
    }

    public static void openHome() throws IOException {
        open("home.fxml");
    }

    public static void openOrders() throws IOException {
        open("orders.fxml");
    }

    public static void openReport() throws IOException {
        open("report.fxml");
    }

    public static void openNotifications() throws IOException {
        open("notifications.fxml");
    }

    public static void openInventories() throws IOException {
        open("inventories.fxml");
    }

    public static void openInventoryStats() throws IOException {
        open("inventory-stats.fxml");
    }

    public static void openInventoryConfig() throws IOException {
        open("inventory-config.fxml");
    }

    public static void openProducts() throws IOException {
        open("products.fxml");
    }

    public static void openProduct(Product product) throws IOException {
        FXMLLoader fxmlLoader = open("product.fxml");

        ProductController productController = fxmlLoader.getController();
        productController.setProduct(product);
    }

    public static void openProductConfig() throws IOException {
        open("product-config.fxml");
    }
}
