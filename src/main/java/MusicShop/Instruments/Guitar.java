package MusicShop.Instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String material, String colour, String type, int price, int sellPrice, int numberOfStrings, String noise) {
        super(material, colour, type, price, sellPrice, noise);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    @Override
    public String play(String noise) {
        return "Yeah yeah";
    }
}
