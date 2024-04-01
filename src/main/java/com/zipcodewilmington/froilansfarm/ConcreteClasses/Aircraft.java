package com.zipcodewilmington.froilansfarm.ConcreteClasses;


import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Vehicle;

public class Aircraft implements Vehicle, NoiseMaker {

    @Override
    public String makeNoise() {
        return "BRRRRRRRR";
    }
}
