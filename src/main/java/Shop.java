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


}
