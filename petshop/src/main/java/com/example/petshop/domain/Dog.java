// restful api 란 Chapter .7
package com.example.petshop.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("dog")
public class Dog extends Pet implements Runnable {
    @Override
    public void speak() {
        System.out.println("멍멍");
    }

    @Override
    public void run() {
        System.out.println("Dog run!");
    }

    @Override
    public void eat() {
        super.eat();
        super.eat();
    }
}