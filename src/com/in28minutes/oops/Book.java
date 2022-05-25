package com.in28minutes.oops;

public class Book {
    //noOfCopies
    private int noCopies;

    Book(int noCopies){
        this.noCopies = noCopies;
    }

    public int getNoCopies(){
        return noCopies;
    }

    public void setNoCopies(int noCopies) { //local variable //creating method
        if (noCopies > 0)
        this.noCopies = noCopies;
    }

    public void increaseNoCopies(int howMany){
        setNoCopies(this.noCopies + howMany);
    }

    public void decreaseNoCopies(int howMany){
        setNoCopies(this.noCopies - howMany);
    }

}
