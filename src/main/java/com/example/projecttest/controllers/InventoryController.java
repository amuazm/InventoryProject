package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import com.example.projecttest.models.Inventory;
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
    private ListView<?> lvProducts;

    @FXML
    void onAddProductClicked(ActionEvent event) {

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

    private void refresh() {
        if (inventory == null) {
            return;
        }

        lblInventoryName.setText(inventory.getName());
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
        refresh();
    }
}
