/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yelon
 */
public class Book { //class book

    //private variabels 
    private String name;
    private int pages;
    private int publicationYear;

    //Constructor for book class
    public Book(String name, int pages, int publicationYear) {
        this.name = name;
        this.pages = pages;
        this.publicationYear = publicationYear;

    }
    //Getter

    public String getName() {
        return name;
    }
    //Getter

    public int getPages() {
        return pages;
    }
    //Getter

    public int publicationYear() {
        return publicationYear;
    }
    //toString method 
    
    public String toString() {
        return name + ", " + pages + " pages, " + publicationYear;
    }

}
