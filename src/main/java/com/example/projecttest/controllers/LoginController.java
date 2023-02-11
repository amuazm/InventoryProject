package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnSignUp;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void onLoginClicked(ActionEvent event) throws Exception {
        InventoryApplication.openHome();
    }

    @FXML
    void onSignUpClicked(ActionEvent event) throws Exception {
        InventoryApplication.openSignup();
    }

}
