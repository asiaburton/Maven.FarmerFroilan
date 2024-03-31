package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import java.util.ArrayList;

public class CropRow <T extends Crop> extends ArrayList<T>{
    public CropRow(T t){
        this.add(t);
    }
}
