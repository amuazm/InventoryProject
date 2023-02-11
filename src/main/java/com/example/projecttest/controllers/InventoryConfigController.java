package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class InventoryConfigController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNotes;

    @FXML
    void onCancelClicked(ActionEvent event) {
        InventoryApplication.back();
    }

    @FXML
    void onSaveClicked(ActionEvent event) {
        System.out.println(txtAddress.getText() + txtName.getText() + txtNotes.getText());
    }

}
