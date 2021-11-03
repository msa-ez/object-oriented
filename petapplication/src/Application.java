// uml tool visual paradigm
// Chapter .1, 2
/*
package src;

public class Application {
    static void main(String args[]){
        
    }
}
*/

//sequence diagram and code
//Chapter .1
/*
import java.util.Scanner;

public class Application {
    Pet pet;
    Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        Application application = new Application();
        application.login();

        for(;;) {
            application.selectPet();
            application.feed();
            application.letSleep();
            application.letSpeak();
            application.showStatus();
        }
    }
    void login() {

    }
    void selectPet() {
        System.out.println("동물을 선택하세요.");
        String selection = sc.nextLine();

        try {
            this.pet = (Pet) Class.forName(selection).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    void feed() {
        this.pet.eat();
    }
    void letSleep() {
        this.pet.sleep();
    }
    void letSpeak() {
        this.pet.speak();
    }
    void showStatus() {
        System.out.println("    몸무게: " + this.pet.weight);
        System.out.println("    에너지: " + this.pet.energy);
    }
}
*/