package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import com.example.projecttest.models.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.io.IOException;

public class ProductController {

    private Product product;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnDeleteProduct;

    @FXML
    private Button btnEditProduct;

    @FXML
    private ListView<?> lvInventories;

    @FXML
    private Text txtOrderCost;

    @FXML
    private Text txtOrderLink;

    @FXML
    private Text txtName;

    @FXML
    private Text txtSellingPrice;

    @FXML
    private Text txtSKU;

    @FXML
    void onBackClicked(ActionEvent event) throws IOException {
        InventoryApplication.back();
    }

    @FXML
    void onDeleteProductClicked(ActionEvent event) {

    }

    @FXML
    void onEditProductClicked(ActionEvent event) {

    }

    private void refresh() {
        if (product == null) {
            return;
        }

        txtName.setText(product.getName());
        txtSKU.setText(product.getSKU());
        txtOrderLink.setText(product.getOrderLink());
        txtOrderCost.setText(String.valueOf(product.getOrderCost()));
        txtSellingPrice.setText(String.valueOf(product.getSellingPrice()));
    }

    public void setProduct(Product product) {
        this.product = product;
        refresh();
    }
}
