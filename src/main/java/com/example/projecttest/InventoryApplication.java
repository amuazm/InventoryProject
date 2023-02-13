package com.example.projecttest;

import com.example.projecttest.controllers.*;
import com.example.projecttest.models.Inventory;
import com.example.projecttest.models.Product;
import com.example.projecttest.models.ProductHistoryRecord;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class InventoryApplication extends javafx.application.Application {
    private static Stage primaryStage;
    private static Stack<String> sceneStackStr;
    public static ArrayList<Product> allProducts = new ArrayList<>();
    public static ArrayList<Inventory> inventories = new ArrayList<>();
    public static ArrayList<ProductHistoryRecord> productHistoryRecords = new ArrayList<>();

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
        sceneStackStr.push(fxmlName);

        FXMLLoader fxmlLoader = getLoader(fxmlName);
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setScene(scene);
        primaryStage.show();

        printSceneStackStr();

        return fxmlLoader;
    }

    private static FXMLLoader getLoader(String fxmlName) {
        return new FXMLLoader(InventoryApplication.class.getResource(fxmlName));
    }

    public static void printSceneStackStr() {
        sceneStackStr.forEach(s -> System.out.print(s + ", "));
        System.out.println();
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

    public static void openInventory(Inventory inventory) throws IOException {
        FXMLLoader fxmlLoader = open("inventory.fxml");

        InventoryController inventoryController = fxmlLoader.getController();
        inventoryController.setInventory(inventory);
    }

    public static void openInventoryConfig() throws IOException {
        open("inventory-config.fxml");
    }

    public static void openInventoryConfig(Inventory inventory) throws IOException {
        FXMLLoader fxmlLoader = open("inventory-config.fxml");

        InventoryConfigController inventoryConfigController = fxmlLoader.getController();
        inventoryConfigController.setInventory(inventory);
    }

    public static void openProducts() throws IOException {
        open("products.fxml");
    }

    public static void openProducts(Inventory inventory) throws IOException {
        FXMLLoader fxmlLoader = open("products.fxml");

        ProductsController productsController = fxmlLoader.getController();
        productsController.setInventory(inventory);
    }

    public static void openProduct(Product product) throws IOException {
        FXMLLoader fxmlLoader = open("product.fxml");

        ProductController productController = fxmlLoader.getController();
        productController.setProduct(product);
    }

    public static void openProductConfig() throws IOException {
        open("product-config.fxml");
    }

    public static void openProductConfig(Product product) throws IOException {
        FXMLLoader fxmlLoader = open("product-config.fxml");

        ProductConfigController productConfigController = fxmlLoader.getController();
        productConfigController.setProduct(product);
    }

    public static void openProductStock(Inventory inventory, Product product) throws IOException {
        FXMLLoader fxmlLoader = open("product-stock.fxml");

        ProductStockController productStockController = fxmlLoader.getController();
        productStockController.setInventory(inventory);
        productStockController.setProduct(product);
    }
}
