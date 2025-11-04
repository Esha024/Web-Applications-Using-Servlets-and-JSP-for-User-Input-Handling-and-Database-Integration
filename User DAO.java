package com.example.webapp;

import java.sql.*;

public class UserDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/webappdb";
    private String jdbcUsername = "root";
    private String jdbcPassword = "password";

    private static final String INSERT_USER_SQL =
        "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";

    public int registerUser(User user) throws ClassNotFoundException {
        int result = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement ps = connection.prepareStatement(INSERT_USER_SQL)) {

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());

            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
