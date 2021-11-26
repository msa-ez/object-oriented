// 7주차 Anonymous Class 와 Observer Pattern
// Chapter .1
// class 정의
/*
package com.example;

public class Animal {
    
    int energy = 0;

    public void eat() {
        energy++;

        if(energy > 10) {
            System.out.println("don't feed too much!");
        }
    }
}
*/



// Chapter .2
// 관찰자 (Observer Pattern) 적용
/*
package com.example;

public class Animal {

    Listener listener;
    public void addListener(Listener listener) {
        this.listener = listener;
    }
    
    int energy = 0;

    public void eat() {
        energy++;

        if(listener!=null) {
            listener.energyChanged(energy);
        }
    }
}
*/

// Chapter .3, 4, 5
// 관찰자 (Observer Pattern)는 보통 한 개만 두지 않습니다. Listener를 List로 업그레이드하여 여러 개를 받을 수 있도록 작성해 줍니다.
/*
package com.example;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    List<Listener> listeners = new ArrayList<Listener>();
    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }
    
    int energy = 0;

    public void eat() {
        energy++;

        if(listeners!=null) {
            for(int i =0; i<listeners.size(); i++){
                listeners.get(i).energyChanged(energy);
            }
        }
    }
}
*/



// Abstract Class
// Chapter .1, 2
// Animal 이란 것은 구체적이지 않기 때문에 App에서 실행할 수 없습니다. 그것을 위해 Dog라는 구체적인 객체가 필요합니다.
/*
package com.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    abstract public void speak();

    List<Listener> listeners = new ArrayList<Listener>();
    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }
    
    int energy = 0;

    public void eat() {
        energy++;

        if(listeners!=null) {
            for(int i =0; i<listeners.size(); i++){
                listeners.get(i).energyChanged(energy);
            }
        }
    }
}
*/



// 접근자와 접근권한
// Chapter .1
/*
package com.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    abstract public void speak();

    List<Listener> listeners = new ArrayList<Listener>();
    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }
    
    int energy = 0;

    public void eat() {
        energy++;

        if(listeners!=null) {
            for(int i =0; i<listeners.size(); i++){
                listeners.get(i).energyChanged(energy);
            }
        }
    }
}
*/



// Chapter .2, 3, 4
// private이라 하는 것은 자기만의 그것 변경 후 기존 Human.java 에서 energy 접근 불가능
// protected 나의 자손들이 접근할 수 있게 하도록 하는 것(자손들이 값을 마음대로 변경 가능하기 때문에 값이 언제 어떻게 변할지 예측 불가능)
// private에 접근 가능한 방법은 setter, getter를 사용하는 것입니다.
/*
package com.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    abstract public void speak();

    List<Listener> listeners = new ArrayList<Listener>();
    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }
    
    private int energy = 0;
        public int getEnergy() {
            return energy;
        }

        protected void setEnergy(int energy) {
            if(Math.abs(this.energy - energy) < 3)
                this.energy = energy;
            else
                throw new IllegalArgumentException("Energy change is too big");
        }

    public void eat() {
        energy++;

        if(listeners!=null) {
            for(int i =0; i<listeners.size(); i++){
                listeners.get(i).energyChanged(energy);
            }
        }
    }
}
*/


// Interface Class
// Chapter .1, 2, 3
/*
package com.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    abstract public void speak();

    List<Listener> listeners = new ArrayList<Listener>();
    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }
    
    private int energy = 0;
        public int getEnergy() {
            return energy;
        }

        protected void setEnergy(int energy) {
            if(Math.abs(this.energy - energy) < 3)
                this.energy = energy;
            else
                throw new IllegalArgumentException("Energy change is too big");
        }

    public void eat() {
        energy++;

        if(listeners!=null) {
            for(int i =0; i<listeners.size(); i++){
                listeners.get(i).energyChanged(energy);
            }
        }
    }
}
*/












