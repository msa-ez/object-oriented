package com.example.petshop;

public class Dog extends Pet implements Runnable {
    @Override
    public void speak() {
        System.out.println("멍멍");
    }

    @Override
    public void run() {
        System.out.println("Dog run!");
    }
}
