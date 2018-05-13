package com.dmitry.zorotti;

import com.dmitry.zorotti.JDBC.Database;
import com.dmitry.zorotti.JDBC.MySQLDB;

import java.sql.SQLException;

public class TestClass {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Database db= new Database();
        db.connect();
        MySQLDB mySQLDB = MySQLDB.getInstance();
    }
}
