import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import shopitems.Drumsticks;
import shopitems.GuitarAmp;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Drumsticks drumsticks;
    GuitarAmp guitarAmp;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("Fender", "Laminated Mahogany", 89.00, 115.00, 6);
        drumsticks = new Drumsticks("Vic Firth American Classic 5A", "Hickory", 7.00, 8.99);
        guitarAmp = new GuitarAmp("Blackstar HT-5 Combo", "Black Leather", 299.00, 361.00);
    }

    @Test
    public void canAddItemToStock(){
        shop.addToStock(drumsticks);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(drumsticks);
        shop.addToStock(guitarAmp);
        shop.removeFromStock(drumsticks);
        assertEquals(2, shop.getStockCount());
    }


}

