package com.dmitry.zorotti.JDBC.dbClasses;

public class Note {
    private User user;
    private String article;
    private String text;


    public Note(User user,String article,String text){
        this.user=user;
        this.article=article;
        this.text=text;
    }
    public String getArticle() {
        return article;
    }

    public String getText() {
        return text;
    }
    public User getUser() {
        return user;
    }
}
