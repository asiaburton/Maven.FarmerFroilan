package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Ridable;

public class Horse implements Animal, Ridable {
    public Horse(){
        super();
    }
    public String makeNoise() {
        return "Neigh";
    }

}
