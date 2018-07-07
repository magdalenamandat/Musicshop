package MusicShop.Instruments;

public abstract class Instrument {

    private String material;
    private String colour;
    private String type;
    private int price;
    private int sellPrice;

    public Instrument(String material, String colour, String type, int price, int sellPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.price = price;
        this.sellPrice = sellPrice;

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
}
