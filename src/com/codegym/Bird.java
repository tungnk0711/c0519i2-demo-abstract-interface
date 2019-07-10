package com.codegym;

public class Bird extends Animal implements FlyAble{
    @Override
    public void eat() {
        System.out.println("Toi an ca");
    }

    @Override
    public void run() {
        System.out.println("Toi chay hai chan");
    }

    @Override
    public void fly() {
        System.out.println("Toi co the bay");
    }

    @Override
    public void fly(String message) {
        System.out.println(message);
    }
}
