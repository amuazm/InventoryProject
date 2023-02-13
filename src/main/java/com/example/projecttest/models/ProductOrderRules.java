package com.example.projecttest.models;

import com.example.projecttest.InventoryApplication;

public class ProductOrderRules {
    private double maxStock;
    private double orderThreshold;
    private boolean isOrderThresholdOrEqual;
    private boolean isOrderThresholdPercentage;

    public ProductOrderRules(double maxStock, double orderThreshold, boolean orderThresholdOrEqual, boolean orderThresholdIsPercentage) {
        this.maxStock = maxStock;
        this.orderThreshold = orderThreshold;
        this.isOrderThresholdOrEqual = orderThresholdOrEqual;
        this.isOrderThresholdPercentage = orderThresholdIsPercentage;
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

    @Override
    public String toString() {
        return "ProductOrderRules{" +
                "maxStock=" + maxStock +
                ", orderThreshold=" + orderThreshold +
                ", isOrderThresholdOrEqual=" + isOrderThresholdOrEqual +
                ", isOrderThresholdPercentage=" + isOrderThresholdPercentage +
                '}';
    }
}
