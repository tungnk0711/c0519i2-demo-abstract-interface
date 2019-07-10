package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here

        FlyAble flyAble = new FlyAble() {
            @Override
            public void fly() {

            }

            @Override
            public void fly(String message) {

            }
        };


        Bird bird  = new Bird();
        bird.eat();
        bird.run();
        bird.fly();
        bird.fly("bay bay bay");


        DaiBang daiBang = new DaiBang();
        daiBang.fly("Toi la so ");
        //Animal animal = new Animal();


    }
}
