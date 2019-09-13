package instruments;

public class Piano extends MusicInstrument{

    private String keyboardType;

    public Piano(String name, String material, double buyingPrice, double sellingPrice, String keyboardType){
        super(name, material, buyingPrice, sellingPrice);
        this.keyboardType = keyboardType;
    }

    public String getKeyboardType() {
        return keyboardType;
    }
}
