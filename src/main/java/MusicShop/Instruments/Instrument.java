package MusicShop.Instruments;

import MusicShop.ISell;


public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private String type;
    private int price;
    private int sellPrice;
    private String noise;

    public Instrument(String material, String colour, String type, int price, int sellPrice, String noise) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.price = price;
        this.sellPrice = sellPrice;
        this.noise = noise;

    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public String play() {
        return this.noise;
    }

    @Override
    public int calculateMarkup(int price, int sellPrice) {
        int markup = sellPrice - price;
        return markup;
    }

}
