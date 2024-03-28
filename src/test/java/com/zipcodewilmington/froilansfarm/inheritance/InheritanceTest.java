package com.zipcodewilmington.froilansfarm.inheritance;

import jdk.internal.vm.annotation.ReservedStackAccess;
import org.junit.Assert;
import org.junit.Test;

public class InheritanceTest {

    @Test
    public void testFarmerInheritance(){
        Botanist farmer = new Farmer();
        Assert.assertTrue(farmer instanceof Botanist);
    }
}
