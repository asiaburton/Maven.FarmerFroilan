package com.zipcodewilmington.froilansfarm.ConcreteClasses;

public class Farm {
    public Stable stable;
    Coop coop;
    FarmHouse fh;
    public Field field;
//    public Silo silo;


    public Farm(){
        stable = new Stable();
        coop = new Coop();
        fh = new FarmHouse();
        field = new Field();
//        silo = new Silo();
    }
}
