package com.example.petshop;

import java.io.Serializable;

public class Cat extends Pet implements Groomable, Serializable, Runnable {
    private int energy = 0;

    @Override
    public void speak() {
        if(getEnergy() < 5) {
            System.out.println("I'm hungry");
        } else {
            System.out.println("HI");
        }
    }

    @Override
    public void run() {
        System.out.println("I'm running!");
    }

    @Override
    public String grooming() {
        energy++;
        setEnergy(energy);
        check();

        return "야옹, 행복하다 집사야";
    }
}
