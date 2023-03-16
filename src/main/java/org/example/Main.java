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

        System.out.println("Добро пожаловать, напишите наименование товара");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            logger.info("Начало создания заказа");
            Goods goods = new Goods();
            goods.setName(br.readLine());
            logger.info("Добавление наименования товара");
            System.out.println("Введите количество товара");
            int amount = Integer.parseInt(br.readLine());
            if (amount <= 0) {
                logger.warn("Количество товара отрицательное число или равно 0");
            } else {
                goods.setAmount(amount);
                logger.info("Добавление количества товара");
            }
                System.out.println("Введите стоимость товара");
                double quantity = Double.parseDouble(br.readLine());
                if (quantity <= 0) {
                    logger.warn("Стоимость товара отрицательное число или равно 0");
                } else {
                    logger.info("Добавление стоимости товара");
                    goods.setQuantity(quantity);
                    Goods.creatFileOrder(goods.getName(), goods.getQuantity(), goods.getAmount());
                }
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("Возникла ошибка при создании заказа");
        }

    }
}