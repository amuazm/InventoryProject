package com.example.projecttest.models;

public class ProductHistoryRecord {
    private Product product;
    private String date;
    private String type;
    private Inventory inventory;
    private int count;

    public ProductHistoryRecord(Product product, String date, String type, Inventory inventory, int count) {
        this.product = product;
        this.date = date;
        this.type = type;
        this.inventory = inventory;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ProductHistoryRecord{" +
                "product=" + product +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", inventory=" + inventory +
                ", count=" + count +
                '}';
    }
}
