package com.dmitry.zorotti.JDBC;

import java.sql.SQLException;

public interface DBFactory {
    public  void getConnection() throws ClassNotFoundException, SQLException;
    public void insertUser();
    public void deleteUser();
    public void addNote();
    public void deleteNote();
}
