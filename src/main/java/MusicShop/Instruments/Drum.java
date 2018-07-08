package MusicShop.Instruments;

public class Drum extends Instrument {

    private int setSize;

    public Drum(String material, String colour, String type, int price, int sellPrice, int setSize, String noise) {
        super(material, colour, type, price, sellPrice, noise);
        this.setSize = setSize;
    }

    public int getSetSize() {
        return setSize;
    }

    @Override
    public String play(String noise) {
        return "Boom boom";
    }

}
