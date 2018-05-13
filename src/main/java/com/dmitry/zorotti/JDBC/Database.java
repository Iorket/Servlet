package com.dmitry.zorotti.JDBC;

import java.sql.*;

public class Database {
    private Statement statement;
    private final String UUSER_NAME="root";
    private final String PASSWORD="root";
    private final String CONNECTION_URL="jdbc:mysql://localhost:3306/schema1"+
            "?verifyServerCertificate=false"+
            "&useSSL=false"+
            "&requireSSL=false"+
            "&useLegacyDatetimeCode=false"+
            "&amp"+
            "&serverTimezone=UTC";
    public Database(){
    }
    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection(CONNECTION_URL,UUSER_NAME,PASSWORD);
        statement= connection.createStatement();
        statement.execute("INSERT into users (name,age,email) values('me',12,'you@mail.ru');");
        ResultSet result= statement.executeQuery("SELECT * FROM users");
        while (result.next()) {
            System.out.println(result.getString(2));
        }
    }
    public void setQuery(String query){

    }
    private String getQuery(String query){
        return query;

    }
}
