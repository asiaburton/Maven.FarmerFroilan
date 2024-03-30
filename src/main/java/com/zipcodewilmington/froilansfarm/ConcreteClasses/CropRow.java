package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import java.util.ArrayList;

public class CropRow extends ArrayList<Crop>{
    public CropRow(){
        this.add(new CornStalk());
    }
}
