package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.AbstractClasses.Person;
import com.zipcodewilmington.froilansfarm.AbstractClasses.Ridable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Horse implements Animal, Ridable {
    public Horse(){
        super();
    }
    public String makeNoise() {
        return "Neigh";
    }

}
