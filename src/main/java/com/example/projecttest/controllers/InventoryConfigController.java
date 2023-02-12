package com.example.projecttest.controllers;

import com.example.projecttest.InventoryApplication;
import com.example.projecttest.models.Inventory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

import static com.example.projecttest.InventoryApplication.inventories;

public class InventoryConfigController {

    private Inventory inventory;

    private boolean isEditing;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private TextField tfAddress;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfNotes;

    @FXML
    void onCancelClicked(ActionEvent event) throws IOException {
        if (!isEditing) {
            InventoryApplication.back();
        } else {
            InventoryApplication.unbackable();
            InventoryApplication.openInventory(inventory);
        }
    }

    @FXML
    void onSaveClicked(ActionEvent event) throws IOException {
        if (!isEditing) {
            // Adding a new inventory
            System.out.println("ADDING PRODUCT");
            inventory = new Inventory(
                    tfName.getText(),
                    tfAddress.getText(),
                    tfNotes.getText()
            );
            inventories.add(inventory);
        } else {
            // Editing an existing inventory
            System.out.println("EDITING PRODUCT");
            inventory.setName(tfName.getText());
            inventory.setAddress(tfAddress.getText());
            inventory.setNotes(tfNotes.getText());
        }
        InventoryApplication.unbackable();
        InventoryApplication.openInventory(inventory);
    }

    private void refresh() {
        if (inventory == null) {
            isEditing = false;
            return;
        } else {
            isEditing = true;
        }

        tfName.setText(inventory.getName());
        tfAddress.setText(inventory.getAddress());
        tfNotes.setText(inventory.getNotes());
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
        refresh();
    }
}
