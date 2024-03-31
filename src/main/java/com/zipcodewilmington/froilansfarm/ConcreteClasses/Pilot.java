package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.AbstractClasses.Person;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Pilot extends Person {

    public CropDuster cd;
    public Pilot(){
        super();
        cd = new CropDuster();
    }

}
