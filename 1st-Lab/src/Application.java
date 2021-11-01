// Hello, world 출력
/*
public class Application {
    public static void main(String args[]) {
        System.out.println("Hello, world");
    } 
}
*/



// Chapter .1
/* 
public class Application {
    public static void main(String args[]) {
        System.out.println("선택한 동물은:" + args[0]);

        if("Dog".equals(args[0])) {
            System.out.println("멍멍");
        } else if("Cat".equals(args[0])) {
            System.out.println("냐옹"); 
        } else if("Chicken".equals(args[0])) {
            System.out.println("꼬꼬댁");
        }
    } 
}
*/

// Chapter .2
/*
public class Application {
    public static void main(String args[]) {
        System.out.println("선택한 동물은:" + args[0]);

        if("Dog".equals(args[0])) {
            Dog.bark();
        } else if("Cat".equals(args[0])) {
            Cat.miwoo();
        } else if("Chicken".equals(args[0])) {
            Chicken.coocoo();
        }
    } 
}
*/

// Chapter .3
/*
public class Application {
    public static void main(String args[]) {
        System.out.println("선택한 동물은:" + args[0]);

        if("Dog".equals(args[0])) {
            Dog.say();
        } else if("Cat".equals(args[0])) {
            Cat.say();
        } else if("Chicken".equals(args[0])) {
            Chicken.say();
        }
    } 
}
*/

// Chapter .4
/*
public class Application {
    public static void main(String args[]) throws Exception {
        System.out.println("선택한 동물은:" + args[0]);

        Animal me = (Animal) Class.forName(args[0]).newInstance();

        if(me != null)
            me.say();
    } 
}
*/

// Chapter .5
/*
public class Application {
    public static void main(String args[]) throws Exception {
        System.out.println("선택한 동물은: " + args[0]);

        Animal me = (Animal) Class.forName(args[0]).newInstance();

        if(me != null) {
            me.say();
            me.eat();
            me.sleep();

            System.out.println("에너지: " + me.energy);
        }
        me = null;
    }
}
*/