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
// Chapter .1, 2
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


// Chapter .3
// Animal에 선언된 protected는 같은 패키지 내에서는 가져다 사용이 가능합니다.
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
        animal.addListener(new FeedListener(2));

        animal.eat();
        animal.speak();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.setEnergy(5);
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



// Chapter .4
// application이라는 패키지로 App.java를 이동했기 때문에 더는 Animal.java에 선언된 protected인 setEnergy를 사용할 수 없게 되었습니다.
// 패키지가 다르기 때문에 import 하여 다른 것들도 가져옵니다.
/*
package com.example.application;

import com.example.Animal;
import com.example.FeedListener;
import com.example.Human;
import com.example.Listener;

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
        animal.addListener(new FeedListener(2));

        animal.eat();
        animal.speak();
        animal.eat();
        animal.eat();
        animal.eat();
        // animal.setEnergy(5);
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



// Interface Class
// Chapter .1
/*
package com.example.application;

import com.example.Animal;
import com.example.Dog;
import com.example.FeedListener;
import com.example.Human;
import com.example.Listener;
import com.example.Robot;
import com.example.Talkable;

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
        animal.addListener(new FeedListener(2));

        animal.eat();
        animal.speak();
        animal.eat();
        animal.eat();
        animal.eat();
        // animal.setEnergy(5);
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.speak();
        animal.eat();

        if(animal instanceof Talkable){
            System.out.println(((Talkable) animal).talkTo("Are you full?"));
        }

        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
    }
}
*/



// Chapter .2
// Human에 새롭게 추가된 성질인 달려봐를 사용합니다.
/*
package com.example.application;

import com.example.Animal;
import com.example.Dog;
import com.example.FeedListener;
import com.example.Human;
import com.example.Listener;
import com.example.Robot;
import com.example.Talkable;

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
        animal.addListener(new FeedListener(2));

        animal.eat();
        animal.speak();
        animal.eat();
        animal.eat();
        animal.eat();
        // animal.setEnergy(5);
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.speak();
        animal.eat();

        if(animal instanceof Talkable){
            System.out.println(((Talkable) animal).talkTo("Are you full?"));
        }

        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();

        if(animal instanceof Runnable){
            ((Runnable) animal).run();
        }
    }
}
*/





// Chapter .3
/*
package com.example.application;

public class App 
{
    public static void main( String[] args )
    {
        Runnable logic = new Runnable() {
            int i=0;

            public void run(){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("do something.." + (i++));
            }
        };

        System.out.println("순차실행 sequential start ----");
        // 순차실행 : 10번이 끝난 후 parallel end 출력
        for(int i=0; i<10; i++) logic.run();
        System.out.println("순차실행 parallel end ----");

        System.out.println("병렬실행 sequential start ----");
        //병렬실행 : parallel end 출력후 숫자 증가
        for(int i=0; i<10; i++) new Thread(logic).start();
        System.out.println("병렬실행 parallel end ----");
    }
}
*/



// Lambda Expression and stream
// Chapter .1
/*
package com.example.application;

import com.example.Animal;
import com.example.Dog;
import com.example.FeedListener;
import com.example.Human;
import com.example.Listener;
import com.example.Robot;
import com.example.Talkable;

public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Dog();
        animal.addListener( (energy)->{
            if( energy > 15){
                System.out.println("don't feed too much!");
            }
        });

        animal.eat();
        animal.speak();
        animal.eat();
        animal.eat();
        animal.eat();
        // animal.setEnergy(5);
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

        if(animal instanceof Talkable){
            System.out.println(((Talkable) animal).talkTo("Are you full?"));
        }

        animal.eat();
        animal.eat();
        animal.eat();
        animal.eat();

        if(animal instanceof Runnable){
            ((Runnable) animal).run();
        }
    }
}
*/

// Chapter .2
// 일반적인 자바 7의 값을 방문하던 방식입니다.
/*
package com.example.application;

import java.util.ArrayList;
import java.util.List;

import com.example.Animal;
import com.example.Dog;
import com.example.FeedListener;
import com.example.Human;
import com.example.Listener;
import com.example.Robot;
import com.example.Talkable;

public class App 
{
    public static void main( String[] args ) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.forEach((x)->System.out.println(x));
    }
}
*/


// Chapter .3
// 기존의 코드를 방문하는 방식을 사람이 알아보기 쉽게 함수형 방식으로 변경
// Consumer라는 Functional Interface가 들어갔기 때문에 동작 가능 합니다.
/*
package com.example.application;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list.forEach((x)->System.out.println(x));
    }
}
*/




// Chapter .4
// 위 코드 보다 더 간결하게
/*
package com.example.application;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list.forEach(System.out::println);
    }
}
*/



// Chapter .5
// list라는 것을 stream으로 변경해서 데이타 처리를 하기위한 형식으로 변경 (Method Chaining)
// 메서드가 객체를 반환하게 되면 메서드의 반환 값인 객체를 통해 또 다른 함수를 호출할 수 있습니다.이러한 프로그래밍 패턴을 메서드 체이닝(Method Chaining)이라 부릅니다.
/*
package com.example.application;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list.stream()
            .filter(x -> x>3) // filter를 거친 값은 4, 5만 남음
            .map(x -> x*x) // 남은 4, 5의 값을 제곱해줍니다.
            .sorted() // 내림차순으로 정리해 줍니다.
            .forEach(System.out::println); // 정리된 값을 화면에 출력해 줍니다.
    }
}
*/






// Chapter .6
// Chapter .5의 구현 방식이 아닌 구 버전인 java7 버전의 구현 방식으로 동일한 코드 구현
// Chapter .5와 비교했을 때 라인수와 코드 해독의 복잡도의 차이를 확인하는 Chapter입니다.
/*
package com.example.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App 
{
    public static void main( String[] args ) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        // 요즘 방식 Lambda expression --> lines
        list.stream()
            .filter(x -> x>3)
            .map(x -> x*x)
            .sorted()
            .forEach(x -> System.out.println("Lambda Expression : " + x));
            

        // 옛날 방식 Java 7 procedural expression --> many lines !
        List<Integer> fillteredList = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > 3)
                fillteredList.add(list.get(i));
        }

        List<Integer> squaredList = new ArrayList<>();
        for(int i=0; i<fillteredList.size(); i++){
            squaredList.add(fillteredList.get(i) * fillteredList.get(i));
        }

        squaredList.sort(new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;

                return i1 - i2;
            }
        });

        for(int i=0; i<squaredList.size(); i++){
            System.out.println("java 7 : " + squaredList.get(i));
        }
    }
}
*/











