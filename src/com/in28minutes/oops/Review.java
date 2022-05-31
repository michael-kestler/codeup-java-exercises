package com.in28minutes.oops;

public class Review {

    private String review;
    private byte rating;

   public Review(String review, byte rating){
        super();
        this.review = review;
        this.rating = rating;
    }

    public String toString(){
       return review + ", " + rating;
    }

}
