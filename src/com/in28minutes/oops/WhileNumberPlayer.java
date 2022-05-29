package com.in28minutes.oops;

public class WhileNumberPlayer {

    private int limit;

    WhileNumberPlayer(int limit){
        this.limit = limit;
    }



    public void SquaresUptoLimit(){
        int i = 1;
        while (i*i < limit) {
            System.out.print(i*i + " ");
          i++;

        }
    }





}
