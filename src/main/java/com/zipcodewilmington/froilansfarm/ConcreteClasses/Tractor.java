package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public class Tractor implements FarmVehicle, NoiseMaker {
    @Override
    public String makeNoise() {
        return "Chug Chug Chug";
    }

    public void harvest(CropRow cr) {
        for(Crop harvestedCrop: cr){
            harvestedCrop.hasBeenHarvested = true;
        }
    }
}
