package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import com.example.projecttest.models.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileWriter;

public class SignUpController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSignUp;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfPassword;

    @FXML
    private TextField tfUsername;

    @FXML
    void onCancelClicked(ActionEvent event) throws Exception {
        InventoryApplication.back();
    }

    @FXML
    void onSignUpClicked(ActionEvent event) throws Exception {
        for (User user : InventoryApplication.users) {
            if (user.getUsername().equals(tfUsername.getText())) {
                Stage login = new Stage();
                Label errorLabel = new Label("Username already taken. Please try another name.");
                errorLabel.setTextFill(Color.RED);
                Scene scene = new Scene(errorLabel, 250, 50);
                login.setScene(scene);
                login.show();
                return;
            }
        }

        User user = new User(
                tfUsername.getText(),
                tfPassword.getText(),
                tfEmail.getText()
        );
        FileWriter writer = new FileWriter("users.txt", true);
        writer.write(user + "\n");
        writer.close();
        InventoryApplication.back();
    }

}
