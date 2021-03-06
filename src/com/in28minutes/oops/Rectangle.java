package com.in28minutes.oops;

public class Rectangle {

    //state

    private int length;
    private int width;

//constructor
    public Rectangle(int length, int width) {
        this.width = width;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int area(){
        return length * width;
    }

    public int perimeter(){
        return 2 * (length * width);
    }

    public String toString(){
        return String.format("length -%d width -%d area - %d perimeter %d",
                length, width, area(), perimeter());
    }


    //operations









}


