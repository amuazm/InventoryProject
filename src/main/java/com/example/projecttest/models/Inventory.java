package com.example.projecttest.models;

import java.util.ArrayList;

public class Inventory {
    private String name;
    private String address;
    private String notes;

    private ArrayList<Product> products;

    public Inventory(String name, String address, String notes) {
        this.name = name;
        this.address = address;
        this.notes = notes;
        products = new ArrayList<>();
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

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
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
