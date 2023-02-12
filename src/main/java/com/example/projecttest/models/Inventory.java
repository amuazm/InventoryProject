package com.example.projecttest.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    private String name;
    private String address;
    private String notes;

    private HashMap<Product, ProductOrderRules> products;

    public Inventory(String name, String address, String notes) {
        this.name = name;
        this.address = address;
        this.notes = notes;
        products = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public HashMap<Product, ProductOrderRules> getProducts() {
        return products;
    }

    public ArrayList<Product> getProductsAsArrayList() {
        return new ArrayList<>(products.keySet());
    }

    public void setProducts(HashMap<Product, ProductOrderRules> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }

}
