package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.AbstractClasses.Botanist;
import com.zipcodewilmington.froilansfarm.AbstractClasses.Person;
import com.zipcodewilmington.froilansfarm.AbstractClasses.Ridable;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Farmer extends Botanist {
    public Tractor tractor;
    public Farmer(){
        super();
        tractor = new Tractor();
    }

    @Override
    public boolean dismount(Ridable ridable) {
        return false;
    }


    public String brush() {
        return "brushing";
    }

    public String clean() {
        return "washing";
    }
}
