package com.example.projecttest.controllers;

import com.example.projecttest.views.LoginView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static com.example.projecttest.InventoryApplication.primaryStage;

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
        LoginView.open(primaryStage);
    }

    @FXML
    void onSignUpClicked(ActionEvent event) throws Exception {
        LoginView.open(primaryStage);
    }

}
