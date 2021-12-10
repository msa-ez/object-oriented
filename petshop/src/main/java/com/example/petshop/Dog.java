// 중간점검 Chpater .1
// Repository Pattern 의 직접 구현 Chpater .1, Chpater .2
/*
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
*/

// JPA 를 기반한 Repository pattern 구현체 자동생성
// Chpater .1
// restful api 란 Chapter .1, Chapter .2, Chapter .3, Chapter .4, Chapter .5, Chapter .6, Chapter .7
/*
package com.example.petshop;

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
*/