package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.ConcreteClasses.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SundayTest {
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
        boolean actual = farm.stable.isEmpty();
        Assert.assertTrue(actual);

    }

    @Test
    public void testStableHasHorsesTrue() {
        farm.stable.add(new Horse());
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
//
//
//
//
//
//
//
//
//
//@Test
//    public void testForCropRow1(){
//        CropRow croprow1=new CropRow();
//        croprow1.add(cropOne);
//        String Expected="CornStalk";
//        String Actual =croprow1.get();
//        Assert.assertEquals(expected, actual);
//}
//
//@Test
//    public void testForCropRow2(){
//        CropRow croprow2=new CropRow();
//        croprow2.add(cropTwo);
//        String Expected="TomatoPlant";
//        String Actual =croprow2.get();
//        Assert.assertEquals(expected, actual);
//    }
//@Test
//    public void testForCropRow3(){
//        CropRow croprow3=new CropRow();
//        croprow3.add(cropThree);
//        String Expected="PotatoPlant";
//        String Actual =croprow3.get();
//        Assert.assertEquals(expected, actual);
//    }
//
//
//
//
}
