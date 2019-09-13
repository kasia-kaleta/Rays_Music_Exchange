package instruments;

public class Guitar extends MusicInstrument {

    private int noOfStrings;

    public Guitar(String name, String material, double buyingPrice, double sellingPrice, int noOfStrings){
        super(name, material, buyingPrice, sellingPrice);
        this.noOfStrings = noOfStrings;
    }


    public int getNoOfStrings() {
        return noOfStrings;
    }
}
