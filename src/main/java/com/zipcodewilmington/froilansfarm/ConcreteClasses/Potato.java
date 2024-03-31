package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Potato extends PotatoPlant implements Edible {

    @Override
    public String toString() {
        return "potato";
    }
}
