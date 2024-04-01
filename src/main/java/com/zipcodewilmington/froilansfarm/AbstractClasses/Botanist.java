package com.zipcodewilmington.froilansfarm.AbstractClasses;

import com.zipcodewilmington.froilansfarm.ConcreteClasses.Crop;
import com.zipcodewilmington.froilansfarm.ConcreteClasses.CropRow;

public abstract class Botanist extends Person {
    public boolean plant(Crop crop, CropRow cr){
        return cr.add(crop);
    }
}
