package MusicShop.Accessories;

import MusicShop.ISell;

public abstract class Accessory implements ISell {

    private int price;
    private int sellPrice;

    public Accessory(int price, int sellPrice){
        this.price = price;
        this.sellPrice = sellPrice;
    }

    public int getPrice() {
        return price;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkup(int price, int sellPrice) {
        int markup = sellPrice - price;
        return markup;
    }
}
