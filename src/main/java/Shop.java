import behaviours.ISell;
import instruments.MusicInstrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;


    public Shop(){
        stock = new ArrayList<ISell>();
    }

    public void addItem(ISell musicInstrument){
      this.stock.add(musicInstrument);
    }




}
