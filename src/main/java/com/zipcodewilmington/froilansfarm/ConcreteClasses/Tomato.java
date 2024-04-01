package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Tomato extends TomatoPlant implements Edible {

    @Override
    public String toString() {
        return "tomato";
    }
}
