package com.example.projecttest;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InventoryApplication extends javafx.application.Application {
    public static Stage primaryStage;
    public static Scene previousScene;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = new Stage();
        openLogin();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void back() {
        primaryStage.setScene(previousScene);
    }

    private static void open(String fxmlName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InventoryApplication.class.getResource(fxmlName));
        previousScene = primaryStage.getScene();
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
}