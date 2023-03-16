package org.example;

import java.io.FileWriter;

public class OrderFile {
    public static void creatFileOrder(String name, double quantity, int amount) {
        try (FileWriter fileWriter = new FileWriter("Order.txt", true)) {
            fileWriter.write("Наименование: ");
            fileWriter.write(name);
            fileWriter.write(" Стоимость: ");
            fileWriter.write(String.valueOf(quantity));
            fileWriter.write(" Количество: ");
            fileWriter.write(String.valueOf(amount));
            fileWriter.write("\n");
        } catch (Exception e) {
            System.out.println("Problems");
        }
    }
}
