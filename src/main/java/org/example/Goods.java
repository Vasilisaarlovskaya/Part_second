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

    public static void creatFileOrder(String name, double quantity, int amount) {
        try (FileWriter fileWriter = new FileWriter("Order.txt", false)) {
            fileWriter.write("Наименование: ");
            fileWriter.write(name);
            fileWriter.write(" Стоимость: ");
            fileWriter.write(String.valueOf(quantity));
            fileWriter.write(" Количество: ");
            fileWriter.write(String.valueOf(amount));
        } catch (Exception e) {
            System.out.println("Problems");
        }

    }
}

