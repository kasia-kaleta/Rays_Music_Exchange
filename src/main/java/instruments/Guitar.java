package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends MusicInstrument implements IPlay, ISell {

    private int noOfStrings;

    public Guitar(String name, String material, double buyingPrice, double sellingPrice, int noOfStrings){
        super(name, material, buyingPrice, sellingPrice);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play(String sound){
        return "The guitar makes a sound: " + sound;
    }

    public double calculateMarkup(){
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
