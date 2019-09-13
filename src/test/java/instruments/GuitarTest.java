package instruments;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Laminated Mahogany", 89.00, 115.00, 6);
    }

    @Test
    public void canGetName(){
        assertEquals("Fender", guitar.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Laminated Mahogany", guitar.getMaterial());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(89.00, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(115.00, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetNoOfStrings(){
        assertEquals(6, guitar.getNoOfStrings());
    }

}
