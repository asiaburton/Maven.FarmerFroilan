package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.AbstractClasses.Person;
import com.zipcodewilmington.froilansfarm.AbstractClasses.Ridable;

public interface Rider extends Ridable {
    String ride();

    boolean mount(Ridable ridable);
    boolean dismount(Ridable ridable);

}
