package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {

    @FXML
    private Button btnInventories;

    @FXML
    private Button btnNotifications;

    @FXML
    private Button btnOrders;

    @FXML
    private Button btnProducts;

    @FXML
    private Button btnReports;

    @FXML
    private Button btnLogout;

    @FXML
    void onInventoriesClicked(ActionEvent event) {

    }

    @FXML
    void onNotificationsClicked(ActionEvent event) {

    }

    @FXML
    void onOrdersClicked(ActionEvent event) throws Exception {
        InventoryApplication.openOrders();
    }

    @FXML
    void onProductsClicked(ActionEvent event) {

    }

    @FXML
    void onReportsClicked(ActionEvent event) {

    }

    @FXML
    void onLogoutClicked(ActionEvent event) throws Exception {
        InventoryApplication.openLogin();
    }

}
