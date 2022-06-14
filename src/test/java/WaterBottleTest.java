import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myWaterBottle= new WaterBottle();

    @Test
    public void canGetVolume() {
        assertEquals(100,myWaterBottle.getVolume());
    }

    @Test
    public void canDrink() {
        myWaterBottle.drink();
        assertEquals(90,myWaterBottle.getVolume());
    }

    @Test
    public void canEmptyBottle() {
        myWaterBottle.emptyBottle();
        assertEquals(0,myWaterBottle.getVolume());
    }

    @Test
    public void canFillBottle() {
        myWaterBottle.emptyBottle();
        myWaterBottle.fillBottle();
        assertEquals(100,myWaterBottle.getVolume());
    }

}