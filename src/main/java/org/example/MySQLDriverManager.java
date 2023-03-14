package org.example;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

    public class MySQLDriverManager {
        private static org.example.MySQLDriverManager instance;
        private static String URL = "jdbc:mysql://localhost:3306/mysql";
        private static String USERNAME = "root";
        private static String PASSWORD = "wroot";
        private MySQLDriverManager() {
            init();
        }
        private void init() {
            try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();        } catch (Exception ex) {
            System.out.println("Exception loading driver...");        }
        }
        public static org.example.MySQLDriverManager getInstance() {
            if (instance == null) {
            instance = new org.example.MySQLDriverManager();        }
            return instance;    }

        public Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
    }
