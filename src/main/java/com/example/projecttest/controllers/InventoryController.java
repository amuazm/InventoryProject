package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import com.example.projecttest.models.Inventory;
import com.example.projecttest.models.Product;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;

public class InventoryController {

    private Inventory inventory;

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
    private ListView<Product> lvProducts;

    @FXML
    void onAddProductClicked(ActionEvent event) throws IOException {
        InventoryApplication.openProducts(inventory);
        InventoryApplication.unbackable();
    }

    @FXML
    void onRemoveProductClicked(ActionEvent event) {

    }

    @FXML
    void onEditInventoryClicked(ActionEvent event) throws IOException {
        InventoryApplication.openInventoryConfig(inventory);
        InventoryApplication.unbackable();
    }

    @FXML
    void onRemoveInventoryClicked(ActionEvent event) throws IOException {
        InventoryApplication.inventories.remove(inventory);
        InventoryApplication.back();
    }

    @FXML
    void onBackClicked(ActionEvent event) throws IOException {
        InventoryApplication.back();
    }

    @FXML
    private void initialize() {
        if (inventory == null) {
            return;
        }

        lvProducts.setItems(FXCollections.observableArrayList(inventory.getProducts()));

        lblInventoryName.setText(inventory.getName());
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
        initialize();
    }
}
