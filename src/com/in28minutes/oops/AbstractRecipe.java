package com.in28minutes.oops;

public abstract class AbstractRecipe {
    public void execute() {
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanup();

    //setup prepare
    //recipe
    //cleanup


}
