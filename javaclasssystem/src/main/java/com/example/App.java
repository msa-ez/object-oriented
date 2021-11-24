// 7주차 Anonymous Class 와 Observer Pattern
// Chapter .1, 2
/*
package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.addListener(new EnergeListener());


        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();

    }
}
*/


// Chapter .3
/*
package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.addListener(new EnergeListener());
        animal.addListener(new FeedListener());


        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();

    }
}
*/


// Chapter .4
// EnergeListener를 제거 후 구현체가 들어가는 부분에 Listener를 바로 삽입
// 장점 : 할 일에 대하여 EnergeListener까지 찾아가지 않고 곧바로 소스코드에서 확인 가능합니다.
// class를 객체화하면서 곧바로 @Override 하는 것을 Anonymous Class(익명 클래스)라고 합니다.
/*
package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.addListener(new Listener(){
            @Override
            public void energyChanged(int energy) {
                if( energy > 10){
                    System.out.println("don't feed too much!");
                }
            }
        });
        animal.addListener(new FeedListener());

        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();

    }
}
*/




// Chapter .5
// App.java의 @Override 영역 부분이 자주 쓰이거나 FeedListener(4) 등의 값이 들어갈 경우 Class로 만들어 주는 것이 현명합니다.
/*
package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.addListener(new Listener(){
            @Override
            public void energyChanged(int energy) {
                if( energy > 10){
                    System.out.println("don't feed too much!");
                }
            }
        });
        animal.addListener(new FeedListener(5));

        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
    }
}
*/


// Abstract Class
// Chapter .1
// 구체적인 객체(Dog) 가 있어야만 오류가 발생하지 않습니다.
/*
package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Dog();
        animal.addListener(new Listener(){
            @Override
            public void energyChanged(int energy) {
                if( energy > 10){
                    System.out.println("don't feed too much!");
                }
            }
        });
        animal.addListener(new FeedListener(5));

        animal.eat();
        animal.speak();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.speak();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
    }
}
*/



// Chapter .2
/*
package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Human();
        animal.addListener(new Listener(){
            @Override
            public void energyChanged(int energy) {
                if( energy > 10){
                    System.out.println("don't feed too much!");
                }
            }
        });
        animal.addListener(new FeedListener(5));

        animal.eat();
        animal.speak();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.speak();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
    }
}
*/


// 접근자와 접근권한
// Chapter .1
package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Human();
        animal.addListener(new Listener(){
            @Override
            public void energyChanged(int energy) {
                if( energy > 10){
                    System.out.println("don't feed too much!");
                }
            }
        });
        animal.addListener(new FeedListener(5));

        animal.eat();
        animal.speak();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.speak();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
    }
}



















