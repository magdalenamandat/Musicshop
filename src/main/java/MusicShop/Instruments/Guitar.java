package MusicShop.Instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String material, String colour, String type, int price, int sellPrice, int numberOfStrings) {
        super(material, colour, type, price, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }
}
