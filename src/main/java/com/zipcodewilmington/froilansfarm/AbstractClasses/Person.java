package com.zipcodewilmington.froilansfarm.AbstractClasses;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public abstract class Person implements NoiseMaker, Eater, Rider {
    private boolean isMounted;

    protected Person(){
        isMounted = false;
    }

    @Override
    public boolean mount(Ridable ridable) {
        if(getIsMounted()){
            // ASSERT: Rider is already mounted to something else. Can't mount another ridable
            return false;
        }
        // Else: mount the new ridable and set isMounted to be true
        setMounted(true);
        return getIsMounted();
    }

    @Override
    public boolean dismount(Ridable ridable) {
        isMounted = false;
        return isMounted;
    }

    public String ride() {
        return "Riding";
    }

    public boolean getIsMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    public String makeNoise(){
        return "Howdy";
    }


}
