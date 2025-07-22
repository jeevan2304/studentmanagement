package com.example.student.student_management;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "jeevan";
    private static final String PASSWORD = "Jeev@2304";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
