package com.zipcodewilmington.froilansfarm.weekdays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MondayTest {
    Farmer froilan;
    Pilot froilanda;
    Farm farm;

    @Before
    public void setUp(){
        froilan = new Farmer();
        froilanda = new Pilot();
        farm = new Farm();
    }

    @Test
    public void testRide() {
        /*
        Ride each horse in each stable
         */
        String expected = "Riding";

        String actual = horse.ride(froilanda);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStableHasHorses() {
        boolean actual = stable.isEmpty;
        Assert.assertFalse(actual);

    }

    @Test
    public void testStableHasHorsesTrue() {
        stable.horses.add(new Horse());
        boolean actual = stable.isEmpty;
        Assert.assertFalse(actual);
    }

    @Test
    public void testStableSizeChange() {
        int expected = stable.horses.size + 1;
        stable.horses.add(new Horse());
        int actual = stable.horses.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilanIsMounting() {
        boolean expected = true;
        boolean actual = froilan.mount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilanIsMountingFalse() {
        boolean expected = false;
        boolean actual = froilan.dismount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilandaIsMounting() {
        boolean expected = true;
        boolean actual = froilanda.mount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilandaIsMountingFalse() {
        boolean expected = false;
        boolean actual = froilanda.dismount();

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
        int expected = silo.size() - 3;
        horse.eat();
        int actual = silo.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilanEat() {
        boolean actual = froilan.eat(corn, tomato, tomato, egg, egg, egg, egg, egg);
        Assert.assertTrue(actual);
    }

    @Test
    public void testFroilandaEat() {

        boolean actual = froilanda.eat(egg, egg, corn, corn, tomato);
        Assert.assertTrue(actual);
    }

    @Test
    public void testFroilanEatFalse() {
        boolean actual = froilan.eat(egg, tractor, corn, corn, tomato);
        Assert.assertFalse(actual);
    }
    @Test
    public void testFroilandaEatFalse() {
        boolean actual = froilanda.eat(egg, tractor, corn, corn, tomato);
        Assert.assertFalse(actual);
    }

    @Test
    public void testSiloSize() {
        int expected = silo.size() - 3;
        boolean eat = froilanda.eat();
        int actual = silo.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChickenEggs(){
        boolean expected = false;
        boolean actual = chicken.hasBeenFertilized;

        Assert.assertEquals(expected, actual);
    }


}
