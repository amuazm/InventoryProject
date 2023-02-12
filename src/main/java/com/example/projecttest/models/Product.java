package com.example.projecttest.models;

public class Product {

    private String name;
    private String SKU;
    private String orderLink;
    private double orderCost;
    private double sellingPrice;

    public Product(String name, String SKU, String orderLink, double orderCost, double sellingPrice) {
        this.name = name;
        this.SKU = SKU;
        this.orderLink = orderLink;
        this.orderCost = orderCost;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getOrderLink() {
        return orderLink;
    }

    public void setOrderLink(String orderLink) {
        this.orderLink = orderLink;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(double orderCost) {
        this.orderCost = orderCost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", SKU='" + SKU + '\'' +
                ", orderLink='" + orderLink + '\'' +
                ", orderCost=" + orderCost +
                ", sellingPrice=" + sellingPrice +
                '}';
    }

}
