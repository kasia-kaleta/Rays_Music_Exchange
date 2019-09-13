import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Casio PX 770", "Black Wood", 515.00, 587.00, "Tri-Sensor Scaled Hammer Action II");
    }

    @Test
    public void canGetName(){
        assertEquals("Casio PX 770", piano.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Black Wood", piano.getMaterial());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(515.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(587.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetKeyboardType(){
        assertEquals("Tri-Sensor Scaled Hammer Action II", piano.getKeyboardType());
    }
}
