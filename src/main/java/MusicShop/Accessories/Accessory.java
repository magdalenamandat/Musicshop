package MusicShop.Accessories;

public abstract class Accessory {

    private int accessoryPrice;
    private int accessorySellPrice;

    public Accessory(int accessoryPrice, int accessorySellPrice){
        this.accessoryPrice = accessoryPrice;
        this.accessorySellPrice = accessorySellPrice;
    }

    public int getAccessoryPrice() {
        return accessoryPrice;
    }

    public int getAccessorySellPrice() {
        return accessorySellPrice;
    }
}
