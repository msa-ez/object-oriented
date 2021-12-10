// restful api 란 Chapter .7
package com.example.petshop.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.example.petshop.Groomable;

@Entity
@DiscriminatorValue("cat")
public class Cat extends Pet implements Groomable, Runnable {
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
        setEnergy(getEnergy() * getEnergy());

        return "야옹, 행복하다 집사야";
    }
}