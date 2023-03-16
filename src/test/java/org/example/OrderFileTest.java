package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class OrderFileTest {
    @Test
    void creatFileOrder() {
        try {
            FileWriter fileWriter = new FileWriter("Order.txt", false);
            fileWriter.write("Наименование: ");
            fileWriter.write("name");
            fileWriter.write(" Стоимость: ");
            fileWriter.write("quantity");
            fileWriter.write(" Количество: ");
            fileWriter.write("amount");
            fileWriter.close();
            FileReader fileReader = new FileReader("Order.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            bufferedReader.close();
            fileReader.close();
            assertEquals("Наименование: name Стоимость: quantity Количество: amount", line);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}