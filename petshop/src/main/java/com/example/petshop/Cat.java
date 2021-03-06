// 중간점검 Chpater .1
// Repository Pattern 의 직접 구현 Chpater .1, Chpater .2
/*
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
*/

// JPA 를 기반한 Repository pattern 구현체 자동생성
// Chpater .1
// restful api 란 Chapter .1, Chapter .2, Chapter .3, Chapter .4, Chapter .5, Chapter .6, Chapter .7
/*
package com.example.petshop;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

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
*/