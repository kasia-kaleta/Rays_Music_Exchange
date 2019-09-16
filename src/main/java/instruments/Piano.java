package instruments;

import behaviours.IPlay;

public class Piano extends MusicInstrument implements IPlay {

    private String keyboardType;

    public Piano(String name, String material, double buyingPrice, double sellingPrice, String keyboardType){
        super(name, material, buyingPrice, sellingPrice);
        this.keyboardType = keyboardType;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public String play(String sound){
        return "The piano makes a sound: " + sound;
    }
}
