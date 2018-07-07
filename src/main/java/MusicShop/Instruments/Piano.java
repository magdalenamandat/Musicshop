package MusicShop.Instruments;

public class Piano extends Instrument{

    private int productionYear;

    public Piano(String material, String colour, String type, int price, int sellPrice, int productionYear) {
        super(material, colour, type, price, sellPrice);
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
