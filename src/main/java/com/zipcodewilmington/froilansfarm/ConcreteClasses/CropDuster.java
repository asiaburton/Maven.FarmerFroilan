package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.Interfaces.Ridable;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle, Ridable {
    public CropDuster(){
        super();
    }

    public Boolean fertilize(CropRow cr) {

        for(int i = 0; i < cr.size(); i++){
            ((Crop) cr.get(i)).hasBeenFertilized = true;
        }
        return true;
    }

}
