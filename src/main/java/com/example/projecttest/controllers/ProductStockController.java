package com.example.projecttest.controllers;

import com.example.projecttest.models.Inventory;
import com.example.projecttest.models.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ProductStockController {

    private Inventory inventory;

    private Product product;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnHistoryAdd;

    @FXML
    private TextField btnHistoryCount;

    @FXML
    private Button btnHistoryRemove;

    @FXML
    private Button btnLess;

    @FXML
    private Button btnLessEqual;

    @FXML
    private Button btnNumber;

    @FXML
    private Button btnOrderThisItem;

    @FXML
    private Button btnPercentage;

    @FXML
    private ChoiceBox<?> cbHistoryInventory;

    @FXML
    private ChoiceBox<?> cbHistoryType;

    @FXML
    private Label lblAvailableMax;

    @FXML
    private Label lblAvailableMaxPercentage;

    @FXML
    private Label lblInventoryName;

    @FXML
    private Label lblOrderRule;

    @FXML
    private Label lblOrderRuleAlt;

    @FXML
    private Label lblProductName;

    @FXML
    private ListView<?> lvHistory;

    @FXML
    private TextField tfHistoryDate;

    @FXML
    private TextField tfOrderRule;

    @FXML
    void onBackClicked(ActionEvent event) {

    }

    @FXML
    void onLessClicked(ActionEvent event) {

    }

    @FXML
    void onLessEqualClicked(ActionEvent event) {

    }

    @FXML
    void onNumberClicked(ActionEvent event) {

    }

    @FXML
    void onOrderThisItemClicked(ActionEvent event) {

    }

    @FXML
    void onPercentageClicked(ActionEvent event) {

    }

    @FXML
    private void initialize() {
        if (inventory == null || product == null) {
            return;
        }

        lblProductName.setText(product.getName());
        lblInventoryName.setText(inventory.getName());
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
        initialize();
    }

    public void setProduct(Product product) {
        this.product = product;
        initialize();
    }
}
