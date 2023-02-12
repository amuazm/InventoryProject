package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import com.example.projecttest.models.Inventory;
import com.example.projecttest.models.Product;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.io.IOException;

import static com.example.projecttest.InventoryApplication.allProducts;
import static com.example.projecttest.InventoryApplication.inventories;

public class InventoriesController {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnRemove;

    @FXML
    private ListView<Inventory> lvInventories;

    @FXML
    void onAddClicked(ActionEvent event) throws IOException {
        InventoryApplication.openInventoryConfig();
    }

    @FXML
    void onBackClicked(ActionEvent event) throws IOException {
        InventoryApplication.back();
    }

    @FXML
    void onRemoveClicked(ActionEvent event) {
        Inventory selectedInventory = lvInventories.getSelectionModel().getSelectedItem();
        if (selectedInventory != null) {
            inventories.remove(selectedInventory);
            refresh();
        }
    }

    @FXML
    private void initialize() {
        lvInventories.setItems(FXCollections.observableArrayList(inventories));

        // lvProducts.setCellFactory(productListView -> new ListCell<>() {
        //     @Override
        //     protected void updateItem(Product item, boolean empty) {
        //         super.updateItem(item, empty);
        //
        //         if (empty || item == null) {
        //             setGraphic(null);
        //         } else {
        //             VBox vBox = new VBox();
        //             Label nameLabel = new Label(item.getName());
        //             Label skuLabel = new Label("SKU: " + item.getSKU());
        //             nameLabel.setFont(Font.font(12));
        //             skuLabel.setFont(Font.font(8));
        //             vBox.getChildren().addAll(nameLabel, skuLabel);
        //             setGraphic(vBox);
        //         }
        //     }
        // });

        lvInventories.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                Inventory selectedInventory = lvInventories.getSelectionModel().getSelectedItem();
                if (selectedInventory != null) {
                    try {
                        InventoryApplication.openInventory(selectedInventory);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
    }

    private void refresh() {
        initialize();
    }

}
