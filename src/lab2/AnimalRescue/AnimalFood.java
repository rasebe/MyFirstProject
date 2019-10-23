package lab2.AnimalRescue;

public class AnimalFood {

    private String brandName;
    private float price;
    private int quantity;
    private char stockAvailability;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public char getStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(char stockAvailability) {
        this.stockAvailability = stockAvailability;
    }
}
