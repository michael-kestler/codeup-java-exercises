package com.in28minutes.oops.level12.interfaces;

public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("goes into a hole");
    }

    @Override
    public void left() {

    }

    @Override
    public void right() {
        System.out.println("go forwards");
    }
}
