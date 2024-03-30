package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.ConcreteClasses.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FridayTest {
    Farmer froilan;
    Pilot froilanda;
    Farm farm;
    Horse horse;

    @Before
    public void setUp(){
        froilan = new Farmer();
        froilanda = new Pilot();
        farm = new Farm();
        horse = new Horse();
    }

    @Test
    public void testRide() {
        String expected = "Riding";

        String actual = froilan.ride();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStableHasHorses() {
        // Removes initial horse added in the constructor
        farm.stable.remove(0);

        // Checks if the stable has a horse
        boolean actual = farm.stable.isEmpty();
        Assert.assertTrue(actual);

    }

    @Test
    public void testStableHasHorsesTrue() {
        // Add a horse
        farm.stable.add(new Horse());

        // Make sure the stable isn't empty
        boolean actual = farm.stable.isEmpty();
        Assert.assertFalse(actual);
    }

    @Test
    public void testStableSizeChange() {
        int expected =farm.stable.size() + 1;
       farm.stable.add(new Horse());
        int actual = farm.stable.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilanIsMounting() {
        boolean expected = true;
        boolean actual = froilan.mount(new Horse());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilanIsMounting2() {

        froilan.mount(new Horse());

        boolean actual = froilan.mount(new Horse());
        Assert.assertFalse(actual);
    }

    @Test
    public void testRiding() {
        String expected = "Riding";
        String actual = froilan.ride();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilanIsMountingFalse() {
        boolean expected = false;
        boolean actual = froilan.getIsMounted();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilanDismounted() {
        boolean expected = false;

        froilan.dismount(new Horse());
        boolean actual = froilan.getIsMounted();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilandaIsMounting() {
        boolean expected = true;
        boolean actual = froilanda.mount(new Horse());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilandaIsMountingFalse() {
        boolean expected = false;
        boolean actual = froilanda.getIsMounted();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFroilandaDismounted() {
        boolean expected = false;
        froilanda.mount(new Horse());
        froilanda.dismount(new Horse());
        boolean actual = froilanda.getIsMounted();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHorseMakeNoise() {
        String expected = "Neigh";
        String actual = horse.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHorseEat() {
        Horse horse = new Horse();
        String expected = "earCorn earCorn earCorn ";
        String actual = horse.eat(new EarCorn(), new EarCorn(), new EarCorn());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilanEat() {

        String expected = "earCorn tomato tomato egg egg egg egg egg ";
        String actual = froilan.eat(new EarCorn(), new Tomato(), new Tomato(),
                new Egg(), new Egg(), new Egg(), new Egg(), new Egg());


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilandaEat() {
        String expected = "egg egg earCorn earCorn tomato ";
        String actual = froilanda.eat(new Egg(), new Egg(), new EarCorn(),
                                      new EarCorn(), new Tomato());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChickenEggs(){
        boolean expected = false;
        Chicken chicken = new Chicken();
        boolean actual = chicken.getHasBeenFertilized();

        Assert.assertEquals(expected, actual);
    }


//    @Test
//    public void testCutGrass() {
//        for (int i = 0; i < farm.field.cropRows.size(); i++) {
//            boolean actual = farm.field.cropRows.get(i).cutGrass;
//        }
//        Assert.assertTrue(actual);
//    }

//    @Test
//    public void testCutGrass() {
//
//        // Iterate through all the crops in the crop rows to see if the grass has been cut
//        for (int i = 0; i < farm.field.cropRows.size(); i++) {
//            boolean actual = farm.field.cropRows.get(i);
//            Assert.assertFalse(actual);
//        }
//
//    }
//    @Test
//    public void testHay1() {
//        boolean expected = true;
//        boolean actual = field.hasBeenCut;
//
//        Assert.assertEquals(expected, actual);
//    }
}
