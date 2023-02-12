package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

public class OrdersController {

    @FXML
    private Button btnBack;

    @FXML
    private ListView<?> lvOrders;

    @FXML
    void onBackClicked(ActionEvent event) throws IOException {
        InventoryApplication.back();
    }

}
