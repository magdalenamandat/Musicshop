package MusicShop.Instruments;

public class Drums extends Instrument {

    private int setSize;

    public Drums(String material, String colour, String type, int price, int sellPrice, int setSize) {
        super(material, colour, type, price, sellPrice);
        this.setSize = setSize;
    }

    public int getSetSize() {
        return setSize;
    }
}
