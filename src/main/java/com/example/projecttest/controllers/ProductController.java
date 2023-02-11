package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.io.IOException;

public class ProductController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnDeleteProduct;

    @FXML
    private Button btnEditProduct;

    @FXML
    private ListView<?> lvInventories;

    @FXML
    private Text txtCost;

    @FXML
    private Text txtLink;

    @FXML
    private Text txtName;

    @FXML
    private Text txtPrice;

    @FXML
    private Text txtSKU;

    @FXML
    void onBackClicked(ActionEvent event) throws IOException {
        InventoryApplication.openProducts();
    }

    @FXML
    void onDeleteProductClicked(ActionEvent event) {

    }

    @FXML
    void onEditProductClicked(ActionEvent event) {

    }

}
