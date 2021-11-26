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
/*
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
*/




// 접근자와 접근권한
// Chapter .2
// Animal에서 선언한 setter, getter를 통해서 private에 접근
/*
package com.example;

public class Human extends Animal{
    @Override
    public void speak() {

        if(getEnergy() < 5){

            setEnergy(5);

            System.out.println("I'm hungry");
        } else
            System.out.println("Hi");
    }
}
*/



// 접근자와 접근권한
// Chapter .3, 4
/*
package com.example;

public class Human extends Animal{
    @Override
    public void speak() {

        if(getEnergy() < 5){
            System.out.println("I'm hungry");
        } else
            System.out.println("Hi");
    }
}
*/



// Interface Class
// Chapter .1
// java는 다중 상속을 지원하지 않습니다.
/*
package com.example;

public class Human extends Animal implements Talkable{
    @Override
    public void speak() {

        if(getEnergy() < 5){
            System.out.println("I'm hungry");
        } else
            System.out.println("Hi");
    }

    @Override
    public String talkTo(String ask) {
        System.out.println("you are asked as follows: "+ ask);

        //answer must be obtained by UI

        return "human answer";
    }
}
*/



// Chpater .2, 3
// interface란 Human라는 class에다가 추가적인 성질을 부여 implementssms 여러 개가 들어갈 수 있습니다.
/*
package com.example;

import java.io.Serializable;

public class Human extends Animal implements Talkable, Serializable, Runnable{
    @Override
    public void speak() {

        if(getEnergy() < 5){
            System.out.println("I'm hungry");
        } else
            System.out.println("Hi");
    }

    @Override
    public String talkTo(String ask) {
        System.out.println("you are asked as follows: "+ ask);

        //answer must be obtained by UI

        return "human answer";
    }

    @Override
    public void run() {
        System.out.println("I'm running!!!");
    }
}
*/












