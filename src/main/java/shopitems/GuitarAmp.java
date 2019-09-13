package shopitems;

import behaviours.ISell;
import instruments.MusicInstrument;

public class GuitarAmp extends MusicInstrument implements ISell {

    public GuitarAmp(String name, String material, double buyingPrice, double sellingPrice){
        super(name, material, buyingPrice, sellingPrice);
    }

    public double calculateMarkup(){
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
