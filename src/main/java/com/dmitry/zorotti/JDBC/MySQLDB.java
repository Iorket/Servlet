package com.dmitry.zorotti.JDBC;

import java.sql.*;

import com.dmitry.zorotti.JDBC.dbClasses.Note;
import com.dmitry.zorotti.JDBC.dbClasses.User;
import com.mysql.jdbc.*;
import com.mysql.jdbc.Driver;

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
    Statement statement;
    private MySQLDB(){};

    public void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection(CONNECTION_URL,USER_NAME,PASSWORD);

    }

    public void insertUser(User user) {

    }

    public void deleteUser(User user) {

    }

    public void addNote(Note note) {

    }

    public void deleteNote(Note note) {

    }
    private boolean updateQuery(String query)  {
        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    private boolean setQuery(String query){
        try {
            statement.execute(query);
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    private String getQuery(String query){
        ResultSet resultSet;
        try {
            resultSet=statement.executeQuery(query);
        } catch (SQLException e) {
            return "";
        }
        //change output to normal view
        return resultSet.toString();
    }
}
