package org.example;

import java.io.FileWriter;

public class OrderFile {
    public static void creatFileOrder(Goods goods) {
        try (FileWriter fileWriter = new FileWriter("Order.txt", true)) {
            fileWriter.write("Наименование: ");
            fileWriter.write(goods.getName());
            fileWriter.write(" Стоимость: ");
            fileWriter.write(String.valueOf(goods.getQuantity()));
            fileWriter.write(" Количество: ");
            fileWriter.write(String.valueOf(goods.getAmount()));
            fileWriter.write("\n");
        } catch (Exception e) {
            System.out.println("Problems");
        }
    }
}
