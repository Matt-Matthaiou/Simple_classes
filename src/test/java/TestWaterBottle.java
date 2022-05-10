import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestWaterBottle {

    @Test
    public void hasVolume(){
        WaterBottle waterbottle = new WaterBottle();
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canReduce(){
        WaterBottle waterbottle = new WaterBottle();
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void canEmpty(){
        WaterBottle waterbottle = new WaterBottle();
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canRefill(){
        WaterBottle waterbottle = new WaterBottle();
        waterbottle.empty();
        waterbottle.refill();
        assertEquals(100, waterbottle.getVolume());
    }
}
