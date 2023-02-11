package com.example.projecttest.controllers;

import com.example.projecttest.views.HomeView;
import com.example.projecttest.views.SignUpView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import static com.example.projecttest.InventoryApplication.primaryStage;

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
        HomeView.open(primaryStage);
    }

    @FXML
    void onSignUpClicked(ActionEvent event) throws Exception {
        SignUpView.open(primaryStage);
    }

}
