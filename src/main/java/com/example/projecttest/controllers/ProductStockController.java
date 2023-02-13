package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import com.example.projecttest.models.Inventory;
import com.example.projecttest.models.Product;
import com.example.projecttest.models.ProductOrderRules;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProductStockController {

    private Inventory inventory;
    private Product product;
    private ProductOrderRules productOrderRules;

    private boolean isEditing;

    private int currentStock;
    private boolean isOrderThresholdOrEqual;
    private boolean isOrderThresholdPercentage;

    // Product and Inventory Name
    @FXML
    private Label lblProductName;
    @FXML
    private Label lblInventoryName;

    // Stock Numbers
    @FXML
    private Label lblAvailableMax;
    @FXML
    private Label lblAvailableMaxPercentage;
    @FXML
    private TextField tfMaxStock;

    // Order Rules
    @FXML
    private Label lblOrderThreshold;
    @FXML
    private Label lblOrderThresholdAlt;
    @FXML
    private Button btnOrderLess;
    @FXML
    private Button btnOrderLessEqual;
    @FXML
    private TextField tfOrderThreshold;
    @FXML
    private Button btnOrderNumber;
    @FXML
    private Button btnOrderPercentage;
    @FXML
    private Button btnOrderThisItem;

    // History
    @FXML
    private Button btnHistoryAdd;
    @FXML
    private Button btnHistoryRemove;
    @FXML
    private TextField tfHistoryDate;
    @FXML
    private ChoiceBox<?> cbHistoryType;
    @FXML
    private ChoiceBox<?> cbHistoryInventory;
    @FXML
    private TextField tfHistoryCount;
    @FXML
    private ListView<?> lvHistory;

    @FXML
    private Button btnBack;

    @FXML
    void onOrderLessClicked(ActionEvent event) {
        isOrderThresholdOrEqual = false;
        updateRules();
    }

    @FXML
    void onOrderLessEqualClicked(ActionEvent event) {
        isOrderThresholdOrEqual = true;
        updateRules();
    }

    @FXML
    void onOrderNumberClicked(ActionEvent event) {
        isOrderThresholdPercentage = false;
        updateRules();
    }

    @FXML
    void onOrderPercentageClicked(ActionEvent event) {
        isOrderThresholdPercentage = true;
        updateRules();
    }

    @FXML
    void onOrderThisItemClicked(ActionEvent event) {

    }

    // Saving ProductOrderRules
    @FXML
    void onBackClicked(ActionEvent event) throws IOException {
        if (!isEditing) {
            // Initialising ProductOrderRules for a Product
            inventory.getProducts().put(product, new ProductOrderRules(
                    0,
                    Double.parseDouble(tfMaxStock.getText()),
                    Double.parseDouble(tfOrderThreshold.getText()),
                    isOrderThresholdOrEqual,
                    isOrderThresholdPercentage
            ));
        } else {
            productOrderRules.setMaxStock(Double.parseDouble(tfMaxStock.getText()));
            productOrderRules.setOrderThreshold(Double.parseDouble(tfOrderThreshold.getText()));
            productOrderRules.setOrderThresholdOrEqual(isOrderThresholdOrEqual);
            productOrderRules.setOrderThresholdPercentage(isOrderThresholdPercentage);
        }
        InventoryApplication.openInventory(inventory);
        InventoryApplication.unbackable();
    }

    @FXML
    private void initialize() {
        if (inventory == null || product == null) {
            return;
        }

        isEditing = inventory.getProducts().containsKey(product);
        if (isEditing) {
            System.out.println("ITS EDITIN TIME");
            productOrderRules = inventory.getProducts().get(product);
            currentStock = productOrderRules.getCurrentStock();
            tfMaxStock.setText(String.valueOf(productOrderRules.getMaxStock()));
            tfOrderThreshold.setText(String.valueOf(productOrderRules.getOrderThreshold()));
            isOrderThresholdOrEqual = productOrderRules.isOrderThresholdOrEqual();
            isOrderThresholdPercentage = productOrderRules.isOrderThresholdPercentage();
            updateRules();
        }

        lblProductName.setText(product.getName());
        lblInventoryName.setText(inventory.getName());

        // Stock
        tfMaxStock.textProperty().addListener((observable, oldValue, newValue) -> updateRules());

        // Order rules
        isOrderThresholdOrEqual = false;
        isOrderThresholdPercentage = false;
        tfOrderThreshold.textProperty().addListener((observable, oldValue, newValue) -> updateRules());
    }

    private void updateRules() {
        String availableMax = "";
        if (inventory.getProducts().containsKey(product)) {
            availableMax += inventory.getProducts().get(product).getCurrentStock();
        } else {
            availableMax += "0";
        }
        availableMax += "/";
        availableMax += tfMaxStock.getText();
        lblAvailableMax.setText(availableMax);

        String orderThreshold = "";
        if (isOrderThresholdOrEqual) {
            orderThreshold += "<=";
        } else {
            orderThreshold += "<";
        }
        orderThreshold += tfOrderThreshold.getText();
        if (isOrderThresholdPercentage) {
            orderThreshold += "%";
        }
        lblOrderThreshold.setText(orderThreshold);
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
