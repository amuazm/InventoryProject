package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSignUp;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void onCancelClicked(ActionEvent event) throws Exception {
        InventoryApplication.openLogin();
    }

    @FXML
    void onSignUpClicked(ActionEvent event) throws Exception {
        InventoryApplication.openLogin();
    }

}
