package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.AbstractClasses.Botanist;
import com.zipcodewilmington.froilansfarm.AbstractClasses.Person;
import com.zipcodewilmington.froilansfarm.AbstractClasses.Ridable;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Farmer extends Botanist {
    public Farmer(){
        super();
    }


    @Override
    public String ride() {
        return "Riding";
    }

//    @Override
//    public boolean mount(Ridable thingToRide) {
//        if(getIsMounted()){
//            // ASSERT: Rider is already mounted to something else. Can't mount another ridable
//            return false;
//        }
//        // Else: mount the new ridable and set isMounted to be true
//        setMounted(true);
//        return getIsMounted();
//    }

    @Override
    public boolean dismount(Ridable ridable) {
//        isMounted = false;
//        return isMounted;
        return false;
    }


}
