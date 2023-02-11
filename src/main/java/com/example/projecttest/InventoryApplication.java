package com.example.projecttest;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class InventoryApplication extends javafx.application.Application {
    private static Stage primaryStage;
    private static Stack<Scene> sceneStack;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = new Stage();
        sceneStack = new Stack<>();
        openLogin();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void back() {
        primaryStage.setScene(sceneStack.get(sceneStack.size() - 1));
        sceneStack.pop();
    }

    private static void open(String fxmlName) throws IOException {
        if (primaryStage.getScene() != null) {
            sceneStack.push(primaryStage.getScene());
        }

        FXMLLoader fxmlLoader = new FXMLLoader(InventoryApplication.class.getResource(fxmlName));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setScene(scene);
        primaryStage.show();
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

    public static void openProduct() throws IOException {
        open("product.fxml");
    }

    public static void openProductConfig() throws IOException {
        open("product-config.fxml");
    }
}