/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
public class Book {
    // attributes
    private String title;
    private int pages;
    private int publicationYears;
    
    // constructors
    public Book(String title,int pages,int publicationYears) {
        this.title = title;
        this.pages = pages;
        this.publicationYears = publicationYears;
    }
    
    /*
    methods:
    1. print(key) key == "name" or key == "everything"
    */
    public void printBook(String key) {
        //
        if (key.equals("name")) {
            System.out.println(this.title);
        }
        
        if (key.equals("everything")) {
            System.out.println(this.title + ", " + this.pages + " pages, " + this.publicationYears);
        }
    }
    
}
