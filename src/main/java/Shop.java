import behaviours.ISell;
import instruments.MusicInstrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;


    public Shop(){
        stock = new ArrayList<ISell>();
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addToStock(ISell musicInstrument){
      this.stock.add(musicInstrument);
    }

    public void removeFromStock(ISell musicInstrument){
        this.stock.remove(musicInstrument);
    }

    public double getTotalProfit(){
        double total = 0;
        for (int i = 0; i < this.getStockCount(); i++){
            total += stock.get(i).calculateMarkup();
        }
        return total;
    }


}
