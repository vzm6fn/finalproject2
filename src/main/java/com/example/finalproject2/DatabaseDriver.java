package com.example.finalproject2;

import java.sql.*;
import java.util.*;


public class DatabaseDriver {

    public static final String STATE_DATABASE_PATH = "CourseReview.sqlite3";

    static Connection connection;

    /// source is from the code example in the google drive file
    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" +
                    STATE_DATABASE_PATH);
            System.out.println("success");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void disconnect()  throws SQLException {
        connection.close();
    }

}
