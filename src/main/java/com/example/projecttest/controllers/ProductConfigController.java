package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import com.example.projecttest.models.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

import static com.example.projecttest.InventoryApplication.products;

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
        Product product = new Product(
                tfName.getText(),
                tfSKU.getText(),
                tfOrderLink.getText(),
                Double.parseDouble(tfOrderCost.getText()),
                Double.parseDouble(tfSellingPrice.getText())
        );
        System.out.println(product);
        products.add(product);
        InventoryApplication.openProduct(product);
    }

}
