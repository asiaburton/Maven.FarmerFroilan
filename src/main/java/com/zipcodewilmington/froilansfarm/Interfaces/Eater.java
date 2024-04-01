package com.zipcodewilmington.froilansfarm.Interfaces;


public interface Eater {
    default String eat(Edible... food){
        String output = "";

        for(Edible item : food){
            output += item.toString() + " ";
        }
        return output;
    }
}
