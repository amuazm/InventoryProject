package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

public class ProductsController {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnRemove;

    @FXML
    private ListView<?> lvProducts;

    @FXML
    void onAddClicked(ActionEvent event) throws IOException {
        InventoryApplication.openProductConfig();
    }

    @FXML
    void onBackClicked(ActionEvent event) {
        InventoryApplication.back();
    }

    @FXML
    void onRemoveClicked(ActionEvent event) {

    }

}
