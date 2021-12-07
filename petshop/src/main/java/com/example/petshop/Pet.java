// 중간점검 Chpater .1
// Repository Pattern 의 직접 구현 Chpater .1, Chpater .2
/*
package com.example.petshop;

import java.util.ArrayList;
import java.util.List;

public abstract class Pet { // Entity. Domain Class.
    abstract public void speak();

    List<Listener> listeners = new ArrayList<Listener>();
    public void addListener(Listener listener)
    {
        this.listeners.add(listener);
    }

    private int energy = 0;

    public int getEnergy() {
        return energy;
    }

    protected void setEnergy(int energy) {
        if(Math.abs(this.energy - energy) < 3) {
            this.energy = energy;
        } else {
            throw new IllegalArgumentException("Energy change is too big");
        }
    }

    public void eat() {
        energy++;
        check();
    }

    public void sleep() {
        energy = energy +2;
        check();
    }

    public void check(){
        if(listeners != null){
            for(int i=0; i < listeners.size(); i++) {
                listeners.get(i).energyChanged(energy);
            }
        }
    }

    @Override
    public String toString() {
        return "<a href='./" + this.getClass().getSimpleName().toLowerCase() + "'" + ">" + this.getClass().getSimpleName() + "</a>";
    }
}
*/




// JPA 를 기반한 Repository pattern 구현체 자동생성
// Chpater .1
// restful api 란 Chapter .1, Chapter .2, Chapter .3
package com.example.petshop;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorColumn(
    discriminatorType = DiscriminatorType.STRING,
    name ="pet_type",
    columnDefinition = "CHAR(5)"
)
public abstract class Pet { // Entity. Domain Class.

    @Id @GeneratedValue
    Long id;
        public Long getId() {
            return id;
        }

    String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            if(name == null) throw new IllegalArgumentException("이름은 꼭 들어가야 합니다.");
            this.name = name;
        }

    abstract public void speak();


    // List<Listener> listeners = new ArrayList<Listener>();
    // public void addListener(Listener listener) {
    //     this.listeners.add(listener);
    // }

    private int energy = 0;

    public int getEnergy() {
        return energy;
    }

    protected void setEnergy(int energy) {
        if(Math.abs(this.energy - energy) < 3) {
            this.energy = energy;
        } else {
            throw new IllegalArgumentException("Energy change is too big");
        }
    }

    public void eat() {
        energy++;
        check();
    }

    public void sleep() {
        energy = energy +2;
        check();
    }

    public void check(){
        // if(listeners != null){
        //     for(int i=0; i < listeners.size(); i++) {
        //         listeners.get(i).energyChanged(energy);
        //     }
        // }
    }

    @Override
    public String toString() {
        return "<a href='./" + this.getClass().getSimpleName().toLowerCase() + "'" + ">" + this.getClass().getSimpleName() + "</a>";
    }
}
