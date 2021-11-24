// Abstract Class
// Chapter .2
/*
package com.example;

public class Human extends Animal{
    @Override
    public void speak() {
        System.out.println("Hi");
    }
}
*/



// 접근자와 접근권한
// Chapter .1

package com.example;

public class Human extends Animal{
    @Override
    public void speak() {

        if(this.energy < 5)
            System.out.println("I'm hungry");
        else
            System.out.println("Hi");
    }
}














