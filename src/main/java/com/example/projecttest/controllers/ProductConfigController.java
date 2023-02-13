package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import com.example.projecttest.models.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

import static com.example.projecttest.InventoryApplication.allProducts;

public class ProductConfigController {

    private Product product;

    private boolean isEditing;

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
    void onCancelClicked(ActionEvent event) throws IOException {
        if (!isEditing) {
            InventoryApplication.back();
        } else {
            InventoryApplication.unbackable();
            InventoryApplication.openProduct(product);
        }
    }

    @FXML
    void onSaveClicked(ActionEvent event) throws IOException {
        if (!isEditing) {
            // Adding a new product
            product = new Product(
                    tfName.getText(),
                    tfSKU.getText(),
                    tfOrderLink.getText(),
                    Double.parseDouble(tfOrderCost.getText()),
                    Double.parseDouble(tfSellingPrice.getText())
            );
            allProducts.add(product);
        } else {
            // Editing an existing product
            product.setName(tfName.getText());
            product.setSKU(tfSKU.getText());
            product.setOrderLink(tfOrderLink.getText());
            product.setOrderCost(Double.parseDouble(tfOrderCost.getText()));
            product.setSellingPrice(Double.parseDouble(tfSellingPrice.getText()));
        }
        InventoryApplication.unbackable();
        InventoryApplication.openProduct(product);
    }

    private void refresh() {
        if (product == null) {
            isEditing = false;
            return;
        } else {
            isEditing = true;
        }

        tfName.setText(product.getName());
        tfSKU.setText(product.getSKU());
        tfOrderLink.setText(product.getOrderLink());
        tfOrderCost.setText(String.valueOf(product.getOrderCost()));
        tfSellingPrice.setText(String.valueOf(product.getSellingPrice()));
    }

    public void setProduct(Product product) {
        this.product = product;
        refresh();
    }

}
