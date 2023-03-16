package org.example;

import org.apache.logging.log4j.core.config.Order;


import java.io.FileWriter;

public class Goods {

    private String name;
    private double quantity;
    private int amount;

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';

    }
}

