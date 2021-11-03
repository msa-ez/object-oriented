// Chapter .1
/*
package src;

public abstract class Pet {
    String name;
    Double weight;
    Double energy;

    public void sleep() {
        energy += 10;
    }
    public void eat() {
        energy += 10;
    }
    abstract public void speak();
}
*/

// Chapter .2
package src;

public abstract class Pet {
    String name;
    Double weight;
    Double energy;
    Tag[] tags;

    public Pet(Tag[] tags) {
        this.tags = tags;
    }

    public void sleep() {
        energy += 10;
    }
    public void eat() {
        energy += 10;
    }
    abstract public void speak();
}
