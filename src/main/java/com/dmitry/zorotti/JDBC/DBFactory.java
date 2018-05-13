package com.dmitry.zorotti.JDBC;

import com.dmitry.zorotti.JDBC.dbClasses.Note;
import com.dmitry.zorotti.JDBC.dbClasses.User;

import java.sql.SQLException;

public interface DBFactory {
    public  void getConnection() throws ClassNotFoundException, SQLException;
    public void insertUser(User user);
    public void deleteUser(User user);
    public void addNote(Note note);
    public void deleteNote(Note note);
}
