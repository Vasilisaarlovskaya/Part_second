package org.example;
//Создать таблицу с данными студентов группы.
//Создать Java-приложение для получения списка всех студентов группы.
//Создать таблицу с городами, где живут студенты. Вывести информацию
// о каждом студенте группы и его родном городе.
//Предусмотреть операции добавления новых городов, новых студентов,
// удаление студентов и удаления городов.

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        MethodsForStudents methodsForStudents = new MethodsForStudents();
        methodsForStudents.selectStudents();
        System.out.println("");
        methodsForStudents.selectStudentsWithCity();
        methodsForStudents.addStudents("'Ork'",
                "'male'", "'no'", "'no'", 3);
        methodsForStudents.addCity("'Braslav'");
        methodsForStudents.dropStudents(9);
        methodsForStudents.dropCity("'Naroch'");
    }
}