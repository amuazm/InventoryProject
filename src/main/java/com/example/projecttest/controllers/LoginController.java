package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import com.example.projecttest.helpers.DataHelper;
import com.example.projecttest.models.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginController {

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnSignUp;

    @FXML
    private PasswordField tfPassword;

    @FXML
    private TextField tfUsername;

    @FXML
    void onLoginClicked(ActionEvent event) throws Exception {
        for (User user : InventoryApplication.users) {
            if (user.getUsername().equals(tfUsername.getText())) {
                if (user.getPassword().equals(tfPassword.getText())) {
                    InventoryApplication.currentUser = user;

                    DataHelper.loadUserData();

                    InventoryApplication.openHome();
                    return;
                }
            }
        }
        Stage login = new Stage();
        Label errorLabel = new Label("Incorrect username or password.");
        errorLabel.setTextFill(Color.RED);
        Scene scene = new Scene(errorLabel, 250, 50);
        login.setScene(scene);
        login.show();
    }

    @FXML
    void onSignUpClicked(ActionEvent event) throws Exception {
        InventoryApplication.openSignUp();
    }

    @FXML
    private void initialize() {
        // Get users
        File file = new File("users.txt");
        InventoryApplication.users = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                InventoryApplication.users.add(DataHelper.userFromString(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        }
    }

}
