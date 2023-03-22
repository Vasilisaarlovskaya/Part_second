package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MethodsForStudents {
    JDBS jdbs = new JDBS();
    public void selectStudents() throws SQLException {
        Connection connection = jdbs.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from lesson_22.students");
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String gender = resultSet.getString(3);
            String education = resultSet.getString(4);
            String job = resultSet.getString(5);
            System.out.println("id: " + id + " Name: " + name + " gender: "
                    + gender + " education: " + education + " job: " + job);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
    public void selectStudentsWithCity() throws SQLException {
        Connection connection = jdbs.getConnection();
        Statement statement = connection.createStatement();
        String selectStudentsWithCity = "Select idstudents, name, gender, education, " +
                "job, nameCity from lesson_22.students, lesson_22.city " +
                "where  cityStudents = idcity";
        ResultSet resultSet = statement.executeQuery(selectStudentsWithCity);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String gender = resultSet.getString(3);
            String education = resultSet.getString(4);
            String job = resultSet.getString(5);
            String city = resultSet.getString(6);
            System.out.println("id: " + id + " Name: " + name + " gender: "
                    + gender + " education: " + education + " job: " + job + " city: " + city);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
    public void addStudents(String nameStudent, String genderStudent, String educationStudent, String jobStudent, int cityStd) throws SQLException {
        Connection connection = jdbs.getConnection();
        Statement statement = connection.createStatement();
        String addStudents = "insert into lesson_22.students (name, gender, education, job, cityStudents) " +
                "values (" + nameStudent + "," + genderStudent + "," + educationStudent + "," + jobStudent + "," + cityStd + ")";
        statement.execute(addStudents);
        statement.close();
        connection.close();
    }
    public void addCity(String name) throws SQLException {
        Connection connection = jdbs.getConnection();
        Statement statement = connection.createStatement();
        String addCity = " insert into lesson_22.city (nameCity)" + "values (" + name + ")";
        statement.execute(addCity);
        statement.close();
        connection.close();
    }
    public void dropStudents(int id) throws SQLException {
        Connection connection = jdbs.getConnection();
        Statement statement = connection.createStatement();
        String deleteStudents = "delete from lesson_22.students where idstudents = " + id;
        statement.execute(deleteStudents);
        statement.close();
        connection.close();
    }
    public void dropCity(String nameCity) throws SQLException {
        Connection connection = jdbs.getConnection();
        Statement statement = connection.createStatement();
        String deleteCity = "delete from lesson_22.city where nameCity = " + nameCity;
        statement.execute(deleteCity);
        statement.close();
        connection.close();
    }
}
