package instruments;

import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Yamaha Rydeen", "Metal & Poplar", 295.00, 356.00, 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Yamaha Rydeen", drums.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Metal & Poplar", drums.getMaterial());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(295.00, drums.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(356.00, drums.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetNoOfCymbals(){
        assertEquals(2, drums.getNoOfCymbals());
    }

    @Test
    public void canPlay(){
        assertEquals("The drums make a sound: badum tish", drums.play("badum tish"));
    }
}
