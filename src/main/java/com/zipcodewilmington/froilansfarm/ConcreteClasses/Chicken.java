package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken implements Produce, Animal {
    boolean hasBeenFertilized;

    public Chicken(){
        hasBeenFertilized = false;
    }

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public String makeNoise() {
        return "Cluck";
    }
}
