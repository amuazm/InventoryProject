package com.example.projecttest;

import com.example.projecttest.views.LoginView;
import javafx.stage.Stage;

public class InventoryApplication extends javafx.application.Application {
    public static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        LoginView loginView = new LoginView();
        primaryStage = new Stage();
        loginView.start(primaryStage);
    }

    public static void main(String[] args) {
        launch();
    }
}