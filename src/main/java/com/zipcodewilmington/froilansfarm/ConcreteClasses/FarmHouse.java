package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.AbstractClasses.Person;

import java.util.ArrayList;

public class FarmHouse extends ArrayList<Person> {
    public FarmHouse() {
        super();
        Person person = new Farmer();
        this.add(person);
    }
}
