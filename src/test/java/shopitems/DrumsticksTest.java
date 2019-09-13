package shopitems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks("Vic Firth American Classic 5A", "Hickory", 7.00, 8.99);
    }

    @Test
    public void canGetName(){
        assertEquals("Vic Firth American Classic 5A", drumsticks.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Hickory", drumsticks.getMaterial());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(7.00, drumsticks.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(8.99, drumsticks.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1.99, drumsticks.calculateMarkup(), 0.01);
    }


}
