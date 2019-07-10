package com.codegym;

public class DaiBang implements FlyAbleChild {
    @Override
    public void fly() {

    }

    @Override
    public void fly(String message) {
        System.out.println(message + ORIENTATION_LEFT);
    }

    @Override
    public void show() {

    }
}
