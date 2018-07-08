package MusicShop.Instruments;

import MusicShop.ISell;

public class Piano extends Instrument implements ISell{

    private int productionYear;

    public Piano(String material, String colour, String type, int price, int sellPrice, int productionYear, String noise) {
        super(material, colour, type, price, sellPrice, noise);
        this.productionYear = productionYear;
    }

    public int getProductionYear() {
        return productionYear;
    }


    @Override
    public String play(String noise) {
        return "Plink plonk";
    }

}
