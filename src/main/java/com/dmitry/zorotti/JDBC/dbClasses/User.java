package com.dmitry.zorotti.JDBC.dbClasses;

public class User {
    private String name;
    private String password;
    public User(String name,String paswword){
        this.name=name;
        this.password=paswword;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
