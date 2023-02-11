package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class InventoryStatsController {

    @FXML
    private Button btnAddProduct;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnEditInventory;

    @FXML
    private Button btnRemoveInventory;

    @FXML
    private Button btnRemoveProduct;

    @FXML
    private Label lblInventoryName;

    @FXML
    private ListView<?> lvProducts;

    @FXML
    void onAddProductClicked(ActionEvent event) {

    }

    @FXML
    void onBackClicked(ActionEvent event) {
        InventoryApplication.back();
    }

    @FXML
    void onEditInventoryClicked(ActionEvent event) {

    }

    @FXML
    void onRemoveInventoryClicked(ActionEvent event) {

    }

    @FXML
    void onRemoveProductClicked(ActionEvent event) {

    }

}
