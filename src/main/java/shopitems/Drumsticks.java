package shopitems;

import behaviours.ISell;
import instruments.MusicInstrument;

public class Drumsticks extends MusicInstrument implements ISell {

    public Drumsticks(String name, String material, double buyingPrice, double sellingPrice){
        super(name, material, buyingPrice, sellingPrice);
    }

    public double calculateMarkup(){
        return this.getSellingPrice() - this.getBuyingPrice();
    }


}
