package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
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

public class ProductsController {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnRemove;

    @FXML
    private ListView<Product> lvProducts;

    @FXML
    void onAddClicked(ActionEvent event) throws IOException {
        InventoryApplication.openProductConfig();
    }

    @FXML
    void onBackClicked(ActionEvent event) throws IOException {
        InventoryApplication.back();
    }

    @FXML
    void onRemoveClicked(ActionEvent event) {
        Product selectedProduct = lvProducts.getSelectionModel().getSelectedItem();
        if (selectedProduct != null) {
            allProducts.remove(selectedProduct);
            refresh();
        }
    }

    @FXML
    private void initialize() {
        lvProducts.setItems(FXCollections.observableArrayList(allProducts));

        lvProducts.setCellFactory(productListView -> new ListCell<>() {
            @Override
            protected void updateItem(Product item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null) {
                    setGraphic(null);
                } else {
                    VBox vBox = new VBox();
                    Label nameLabel = new Label(item.getName());
                    Label skuLabel = new Label("SKU: " + item.getSKU());
                    nameLabel.setFont(Font.font(12));
                    skuLabel.setFont(Font.font(8));
                    vBox.getChildren().addAll(nameLabel, skuLabel);
                    setGraphic(vBox);
                }
            }
        });

        lvProducts.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                Product selectedProduct = lvProducts.getSelectionModel().getSelectedItem();
                if (selectedProduct != null) {
                    try {
                        InventoryApplication.openProduct(selectedProduct);
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
