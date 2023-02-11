package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class NotificationsController {

    @FXML
    private Button btnBack;

    @FXML
    private ListView<?> lvNotifications;

    @FXML
    void onBackClicked(ActionEvent event) {
        InventoryApplication.back();
    }

}
