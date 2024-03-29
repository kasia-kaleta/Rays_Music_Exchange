package instruments;

import behaviours.IPlay;

public class Drums extends MusicInstrument implements IPlay {


    private int noOfCymbals;


    public Drums(String name, String material, double buyingPrice, double sellingPrice, int noOfCymbals){
        super(name, material, buyingPrice, sellingPrice);
        this.noOfCymbals = noOfCymbals;
    }

    public int getNoOfCymbals() {
        return noOfCymbals;
    }

    public String play(String sound){
        return "The drums make a sound: " + sound;
    }


}
