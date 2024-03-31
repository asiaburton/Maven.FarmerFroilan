package com.zipcodewilmington.froilansfarm.Constructors;

import com.zipcodewilmington.froilansfarm.AbstractClasses.Person;
import com.zipcodewilmington.froilansfarm.ConcreteClasses.*;
import org.junit.Assert;
import org.junit.Test;

public class Constructors {
    @Test
    public void testStableConstructor() {
        Stable stable = new Stable();
        boolean actual = stable.get(0) instanceof Horse;
        Assert.assertTrue(actual);
    }

    @Test
    public void testFarmHouseConstructor() {
        FarmHouse farmHouse = new FarmHouse();
        boolean actual = farmHouse.get(0) instanceof Person;
        Assert.assertTrue(actual);
    }

    @Test
    public void testCoopConstructor() {
        Coop coop = new Coop();
        boolean actual = coop.get(0) instanceof Chicken;
        Assert.assertTrue(actual);
    }
}
