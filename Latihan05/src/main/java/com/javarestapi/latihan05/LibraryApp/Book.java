/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javarestapi.latihan05.LibraryApp;

/**
 *
 * @author USER
 */
public class Book {
    private long id;
    private String title;
    private String author;
    
    public Book() {}
    
    public Book(long id, String title, String Author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
          

}
