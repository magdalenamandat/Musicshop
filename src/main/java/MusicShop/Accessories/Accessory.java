package MusicShop.Accessories;

public abstract class Accessory {

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
}
