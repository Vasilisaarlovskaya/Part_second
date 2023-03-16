//Создать программу для сохранение заказа на покупку товара в файл. Данные о заказе
//(наименование товара, количество, общая стоимость) вводятся пользователем с клавиатуры.
//Сделать логирование действий пользователя в файл.
//Предусмотреть различные уровни логировня: общая информация,
//предупреждающие сообщения, сообщения об ошибках.
//Сделать unit-тесты 50%
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Добро пожаловать. Хотите оформить заказ?");
            while (br.readLine().equals("да")) {
                System.out.println("Напишите наименование товара");
                logger.info("Начало создания заказа");
                Goods goods = new Goods();
                goods.setName(br.readLine());
                logger.info("Добавление наименования товара");
                System.out.println("Введите количество товара");
                int amount;
                while ((amount = Integer.parseInt(br.readLine())) <= 0) {
                    System.out.println("Количество товара отрицательное число или равно 0. Повторите ввод");
                    logger.warn("Количество товара отрицательное число или равно 0");
                }
                goods.setAmount(amount);
                logger.info("Добавление количества товара");
                System.out.println("Введите стоимость товара");
                double quantity;
                while ((quantity = Double.parseDouble(br.readLine())) <= 0) {
                    System.out.println("Стоимость товара отрицательное число или равно 0. Повторите ввод");
                    logger.warn("Стоимость товара отрицательное число или равно 0");
                }
                logger.info("Добавление стоимости товара");
                goods.setQuantity(quantity);
                OrderFile.creatFileOrder(goods.getName(), goods.getQuantity(), goods.getAmount());
                System.out.println("Хотите оформить еще один заказ?");
            }
        } catch(IOException e){
                e.printStackTrace();
                logger.error("Возникла ошибка при создании заказа");
            }
        System.out.println("Вы оформили заказ(ы)");
    }
}