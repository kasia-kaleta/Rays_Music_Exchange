package instruments;

public abstract class MusicInstrument {

    private String name;
    private String material;
    private double buyingPrice;
    private double sellingPrice;


    public MusicInstrument(String name, String material, double buyingPrice, double sellingPrice){
        this.name = name;
        this.material = material;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

}
