package com.example.projecttest.models;

public class ProductOrderRules {
    private int currentStock;
    private double maxStock;

    private double orderThreshold;
    private boolean isOrderThresholdOrEqual;
    private boolean isOrderThresholdPercentage;

    public ProductOrderRules(int currentStock, double maxStock, double orderThreshold, boolean orderThresholdOrEqual, boolean orderThresholdIsPercentage) {
        this.currentStock = currentStock;
        this.maxStock = maxStock;
        this.orderThreshold = orderThreshold;
        this.isOrderThresholdOrEqual = orderThresholdOrEqual;
        this.isOrderThresholdPercentage = orderThresholdIsPercentage;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public double getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(double maxStock) {
        this.maxStock = maxStock;
    }

    public double getOrderThreshold() {
        return orderThreshold;
    }

    public void setOrderThreshold(double orderThreshold) {
        this.orderThreshold = orderThreshold;
    }

    public boolean isOrderThresholdOrEqual() {
        return isOrderThresholdOrEqual;
    }

    public void setOrderThresholdOrEqual(boolean orderThresholdOrEqual) {
        this.isOrderThresholdOrEqual = orderThresholdOrEqual;
    }

    public boolean isOrderThresholdPercentage() {
        return isOrderThresholdPercentage;
    }

    public void setOrderThresholdPercentage(boolean orderThresholdPercentage) {
        this.isOrderThresholdPercentage = orderThresholdPercentage;
    }
}