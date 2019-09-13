package shopitems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarAmpTest {

    GuitarAmp guitarAmp;

    @Before
    public void before(){
        guitarAmp = new GuitarAmp("Blackstar HT-5 Combo", "Black Leather", 299.00, 361.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Blackstar HT-5 Combo", guitarAmp.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Black Leather", guitarAmp.getMaterial());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(299.00, guitarAmp.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(361.00, guitarAmp.getSellingPrice(), 0.01);
    }
}
