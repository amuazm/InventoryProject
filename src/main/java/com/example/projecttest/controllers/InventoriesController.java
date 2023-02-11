package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

public class InventoriesController {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnRemove;

    @FXML
    private ListView<?> lvInventories;

    @FXML
    void onAddClicked(ActionEvent event) throws IOException {
        InventoryApplication.openInventoryConfig();
    }

    @FXML
    void onBackClicked(ActionEvent event) {
        InventoryApplication.back();
    }

    @FXML
    void onRemoveClicked(ActionEvent event) {

    }

}
