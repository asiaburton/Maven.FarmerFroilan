package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.AbstractClasses.Ridable;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

import java.util.ArrayList;

public class CropDuster extends Aircraft implements FarmVehicle, Ridable {
    public CropDuster(){
        super();
    }

    public void fertilize(CropRow cr) {

        for(int i = 0; i < cr.size(); i++){
            cr.get(i).hasBeenFertilized = true;
        }
    }

    public String makeNoise() {
        return "BRRRRRRRR";
    }
}
