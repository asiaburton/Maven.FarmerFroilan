package com.zipcodewilmington.froilansfarm.inheritance;

import com.zipcodewilmington.froilansfarm.AbstractClasses.*;
import com.zipcodewilmington.froilansfarm.ConcreteClasses.*;
import com.zipcodewilmington.froilansfarm.Interfaces.*;
import org.junit.Assert;
import org.junit.Test;

public class InheritanceTest {


    @Test
    public void testNoiseMakerInheritance1(){
        NoiseMaker car = (NoiseMaker) new Tractor();
        Assert.assertTrue(car instanceof NoiseMaker);
    }

    @Test
    public void testNoiseMakerInheritance2(){
//        NoiseMaker cat = new Cow();
//        Assert.assertTrue(cat instanceof NoiseMaker);
    }

    @Test
    public void testNoiseMakerInheritance3(){
        NoiseMaker human = new Farmer();
        Assert.assertTrue(human instanceof NoiseMaker);
    }

    @Test
    public void testVehicleInheritance1(){
        Vehicle truck = new Tractor();
        Assert.assertTrue(truck instanceof Vehicle);
    }

    @Test
    public void testVehicleInheritance2(){
        Vehicle plane = (Vehicle) new Aircraft();
        Assert.assertTrue(plane instanceof Vehicle);
    }

    @Test
    public void testRidableInheritance1(){
        Ridable ride = new Horse();
        Assert.assertTrue(ride instanceof Ridable);
    }

    @Test
    public void testRidableInheritance2(){
        Ridable horse = new Horse();
        Assert.assertTrue(horse instanceof Ridable);
    }

    @Test
    public void testFarmVehicleInheritance1(){
        FarmVehicle tractor = new Tractor();
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }

    @Test
    public void testFarmVehicleInheritance2(){
        FarmVehicle duster = new CropDuster();
        Assert.assertTrue(duster instanceof FarmVehicle);
    }

    @Test
    public void testAircraftInheritance(){
        Aircraft duster = new CropDuster();
        Assert.assertTrue(duster instanceof Aircraft);
    }

    @Test
    public void testAnimalInheritance1(){
        Animal pet = new Horse();
        Assert.assertTrue(pet instanceof Animal);
    }

    @Test
    public void testAnimalInheritance2(){
        Animal pet = new Chicken();
        Assert.assertTrue(pet instanceof Animal);
    }

    @Test
    public void testEaterInheritance1(){
        Eater eater = new Pilot();
        Assert.assertTrue(eater instanceof Eater);
    }

    @Test
    public void testEaterInheritance2(){
        Eater eater = new Chicken();
        Assert.assertTrue(eater instanceof Eater);
    }

    @Test
    public void testRiderInheritance(){
        Rider human = new Farmer();
        Assert.assertTrue(human instanceof Rider);
    }

    @Test
    public void testPersonInheritance1(){
        Person human = new Froilan();
        Assert.assertTrue(human instanceof Person);
    }

    @Test
    public void testPersonInheritance2(){
        Person human = new Pilot();
        Assert.assertTrue(human instanceof Person);
    }

    @Test
    public void testBotanistInheritance(){
        Botanist human = new Farmer();
        Assert.assertTrue(human instanceof Botanist);
    }

    @Test
    public void testFarmerInheritance(){
        Farmer farmer = new Froilan();
        Assert.assertTrue(farmer instanceof Farmer);
    }

    @Test
    public void testPilotInheritance(){
        Pilot pilot = new Froilanda();
        Assert.assertTrue(pilot instanceof Pilot);
    }

    @Test
    public void testEdibleInheritance1(){
        Edible corn = new EarCorn();
        Assert.assertTrue(corn instanceof Edible);
    }

    @Test
    public void testEdibleInheritance2(){
        Edible tomato = new Tomato();
        Assert.assertTrue(tomato instanceof Edible);
    }

    @Test
    public void testEdibleInheritance3(){
        Edible egg = new Egg();
        Assert.assertTrue(egg instanceof Edible);
    }

    @Test
    public void testProduceInheritance1(){
        Produce prod = new Chicken();
        Assert.assertTrue(prod instanceof Produce);
    }

    @Test
    public void testProduceInheritance2(){
        Produce prod = new Crop();
        Assert.assertTrue(prod instanceof Produce);
    }

    @Test
    public void testCropInheritance1(){
        Crop corn = new CornStalk();
        Assert.assertTrue(corn instanceof Crop);
    }

    @Test
    public void testCropInheritance2(){
        Crop tomato = new TomatoPlant();
        Assert.assertTrue(tomato instanceof Crop);
    }

//    @Test
//    public void testCropInheritance3(){
//        Crop row = new CropRow();
//        Assert.assertTrue(row instanceof Crop);
//    }

    @Test
    public void testTomatoPlantInheritance(){
        TomatoPlant tomato = new Tomato();
        Assert.assertTrue(tomato instanceof TomatoPlant);
    }

//    @Test
//    public void testCornStalkInheritance(){
//        CornStalk cs = new EarCorn();
//        Assert.assertTrue(cs instanceof CornStalk);
//    }

    @Test
    public void testRiderInheritance2(){
        Ridable rider = (Ridable) new Horse();
        Assert.assertTrue(rider instanceof Ridable);
    }
}
