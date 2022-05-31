package com.in28minutes.oops;

import java.util.ArrayList;

public class Book {

    private String title;
    private int id;
    private String author;

    private ArrayList<Review> review = new ArrayList<>();

    Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    public Review getReview() {
//        return review;
//    }
//
//    public void setReview(Review review) {
//        this.review = review;
//    }

    public String toString(){
        return String.format("id = %d  title = %s Review = [%s]",
                id, title, author, review);
    }

    //noOfCopies
//    private int noCopies;
//
//    Book(int noCopies){
//        this.noCopies = noCopies;
//    }
//
//    public int getNoCopies(){
//        return noCopies;
//    }
//
//    public void setNoCopies(int noCopies) { //local variable //creating method
//        if (noCopies > 0)
//        this.noCopies = noCopies;
//    }
//
//    public void increaseNoCopies(int howMany){
//        setNoCopies(this.noCopies + howMany);
//    }
//
//    public void decreaseNoCopies(int howMany){
//        setNoCopies(this.noCopies - howMany);
//    }

}
