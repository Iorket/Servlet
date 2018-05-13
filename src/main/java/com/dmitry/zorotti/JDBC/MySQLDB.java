package com.dmitry.zorotti.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.*;

public class MySQLDB implements DBFactory{
    private final String USER_NAME="root";
    private final String PASSWORD="root";
    private final String CONNECTION_URL="jdbc:mysql://localhost:3306/schema1"+
            "?verifyServerCertificate=false"+
            "&useSSL=false"+
            "&requireSSL=false"+
            "&useLegacyDatetimeCode=false"+
            "&amp"+
            "&serverTimezone=UTC";
    private static MySQLDB instance;
    public static  MySQLDB getInstance(){
        MySQLDB localInstance=instance;
        if(localInstance.equals(null)){
            synchronized (MySQLDB.class){
                localInstance=instance;
                if(localInstance.equals(null)){
                    instance=localInstance=new MySQLDB();
                }
            }
        }
        return  localInstance;
    }
    Connection connection=null;
    private MySQLDB(){};

    public void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection(CONNECTION_URL,USER_NAME,PASSWORD);

    }

    public void insertUser() {

    }

    public void deleteUser() {

    }

    public void addNote() {

    }

    public void deleteNote() {

    }
}
