package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProductConfigController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfOrderCost;

    @FXML
    private TextField tfOrderLink;

    @FXML
    private TextField tfSKU;

    @FXML
    private TextField tfSellingPrice;

    @FXML
    void onCancelClicked(ActionEvent event) {
        InventoryApplication.back();
    }

    @FXML
    void onSaveClicked(ActionEvent event) throws IOException {
        InventoryApplication.openProduct();
    }

}
