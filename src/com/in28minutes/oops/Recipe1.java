package com.in28minutes.oops;

public class Recipe1 extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("get the utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");

    }

    @Override
    void cleanup() {
        System.out.println("Cleanup the utensils");

    }
}
