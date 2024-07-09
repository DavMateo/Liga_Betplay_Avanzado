package com.betplay.infoMgmt.infrastructure.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTeamConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER  = "campus2023";
    private static final String PASSWORD = "campus2023";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
