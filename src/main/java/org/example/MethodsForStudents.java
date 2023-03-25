package org.example;

import java.sql.*;

public class MethodsForStudents {
    JDBS jdbs = new JDBS();

    public void selectStudents() throws SQLException {
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        try {
            connection = jdbs.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from lesson_22.students");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String gender = resultSet.getString(3);
                String education = resultSet.getString(4);
                String job = resultSet.getString(5);
                System.out.println("id: " + id + " Name: " + name + " gender: "
                        + gender + " education: " + education + " job: " + job);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
    }

    public void selectStudentsWithCity() throws SQLException {
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        try {
            connection = jdbs.getConnection();
            statement = connection.createStatement();
            String selectStudentsWithCity = "Select idstudents, name, gender, education, " +
                    "job, nameCity from lesson_22.students, lesson_22.city " +
                    "where  cityStudents = idcity";
            resultSet = statement.executeQuery(selectStudentsWithCity);
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
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
    }

    public void addStudents(String nameStudent, String genderStudent, String educationStudent, String jobStudent, int cityStd) throws SQLException {
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        try {
            connection = jdbs.getConnection();
            String addStudents = "insert into lesson_22.students (name, gender, education, job, cityStudents) " +
                    "values (" + nameStudent + "," + genderStudent + "," + educationStudent + "," + jobStudent + "," + cityStd + ")";
            prepareStatement = connection.prepareStatement(addStudents);
            prepareStatement.execute(addStudents);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            prepareStatement.close();
            connection.close();
        }
    }

    public void addCity(String name) throws SQLException {
        PreparedStatement prepareStatement = null;
        Connection connection = null;
        try {
            connection = jdbs.getConnection();
            String addCity = " insert into lesson_22.city (nameCity)" + "values (" + name + ")";
            PreparedStatement preparedStatement = connection.prepareStatement(addCity);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            prepareStatement.close();
            connection.close();
        }
    }

    public void dropStudents(int id) throws SQLException {
        PreparedStatement prepareStatement = null;
        Connection connection = null;
        try {
            connection = jdbs.getConnection();
            String deleteStudents = "delete from lesson_22.students where idstudents = " + id;
            PreparedStatement preparedStatement = connection.prepareStatement(deleteStudents);
            preparedStatement.execute(deleteStudents);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            prepareStatement.close();
            connection.close();
        }
    }

    public void dropCity(String nameCity) throws SQLException {
        PreparedStatement prepareStatement = null;
        Connection connection = null;
        try {
            connection = jdbs.getConnection();
            String deleteCity = "delete from lesson_22.city where nameCity = " + nameCity;
            PreparedStatement preparedStatement = connection.prepareStatement(deleteCity);
            preparedStatement.execute(deleteCity);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            prepareStatement.close();
            connection.close();
        }
    }
}
