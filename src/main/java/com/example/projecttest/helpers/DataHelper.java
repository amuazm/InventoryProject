package com.example.projecttest.helpers;

import com.example.projecttest.InventoryApplication;
import com.example.projecttest.models.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataHelper {
    public static void saveUserData() throws IOException {
        User currentUser = InventoryApplication.currentUser;
        if (currentUser == null) {
            return;
        }

        File file = new File("userdata/" + currentUser.getUsername());
        if (!file.exists()) {
            if (!file.createNewFile()) {
                return;
            }
        }
        // Make sure file is empty
        FileWriter fileWriter;
        fileWriter = new FileWriter(file, false);
        fileWriter.write("");
        fileWriter.close();
        // Write to file
        fileWriter = new FileWriter(file, true);
        for (Inventory inventory : InventoryApplication.inventories) {
            fileWriter.write(inventory + "\n");
        }
        for (Product product : InventoryApplication.allProducts) {
            fileWriter.write(product + "\n");
        }
        for (ProductHistoryRecord productHistoryRecord : InventoryApplication.productHistoryRecords) {
            fileWriter.write(productHistoryRecord + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }

    public static void loadUserData() throws IOException {
        // Check if user's data file exists or create it
        File file = new File("userdata/" + InventoryApplication.currentUser.getUsername());
        if (!file.exists()) {
            if (!file.createNewFile()) {
                return;
            }
            return;
        }

        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String lineType = line.substring(0, line.indexOf("{"));

            switch (lineType) {
                case "Inventory" -> {
                    Inventory inventory = inventoryFromString(line);
                    if (!InventoryApplication.inventories.contains(inventory)) {
                        InventoryApplication.inventories.add(inventory);
                    }
                }
                case "Product" -> {
                    Product product = productFromString(line);
                    if (!InventoryApplication.allProducts.contains(product)) {
                        InventoryApplication.allProducts.add(product);
                    }
                }
                case "ProductHistoryRecord" -> {
                }
            }
        }
    }

    public static void clearData() {
        InventoryApplication.inventories = new ArrayList<>();
        InventoryApplication.allProducts = new ArrayList<>();
        InventoryApplication.productHistoryRecords = new ArrayList<>();
    }

    public static User userFromString(String s) {
        int startIndex = s.indexOf("'") + 1;
        int endIndex = s.indexOf("'", startIndex);
        String username = s.substring(startIndex, endIndex);

        startIndex = s.indexOf("'", endIndex + 1) + 1;
        endIndex = s.indexOf("'", startIndex);
        String password = s.substring(startIndex, endIndex);

        startIndex = s.indexOf("'", endIndex + 1) + 1;
        endIndex = s.indexOf("'", startIndex);
        String email = s.substring(startIndex, endIndex);

        return new User(username, password, email);
    }

    public static Inventory inventoryFromString(String s) {
        // String name = "";
        // String address = "";
        // String notes = "";
        // HashMap<Product, ProductOrderRules> products = new HashMap<>();
        //
        // s = s.substring(s.indexOf("{") + 1, s.lastIndexOf("}"));
        // String[] parts = s.split(", products=\\{");
        // String[] parts2 = parts[1].split("Product\\{");
        // for (int i = 1; i < parts2.length; i++) {
        //     String[] parts3 = parts2[i].split()
        // }
        //
        // System.out.println(name);
        // System.out.println(address);
        // System.out.println(notes);
        // System.out.println(products);
        // return new Inventory(name, address, notes, products);
        return null;
    }

    public static Product productFromString(String s) {
        String name = "";
        String SKU = "";
        String orderLink = "";
        double orderCost = 0;
        double sellingPrice = 0;

        s = s.substring(s.indexOf("{") + 1, s.length() - 1);
        String[] parts = s.split(",");
        for (String part : parts) {
            String[] keyValue = part.split("=");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();
            switch (key) {
                case "name" -> name = value.substring(1, value.length() - 1);
                case "SKU" -> SKU = value.substring(1, value.length() - 1);
                case "orderLink" -> orderLink = value.substring(1, value.length() - 1);
                case "orderCost" -> orderCost = Double.parseDouble(value);
                case "sellingPrice" -> sellingPrice = Double.parseDouble(value);
            }
        }

        return new Product(name, SKU, orderLink, orderCost, sellingPrice);
    }

    public static ProductOrderRules productOrderRulesFromString(String s) {

        return null;
    }

    public static ProductHistoryRecord productHistoryRecordFromString(String s) {

        return null;
    }
}
