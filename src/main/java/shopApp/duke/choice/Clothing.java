package shopApp.duke.choice;

public class Clothing {
    String description;
    double price;
    String size = "M";

    public Clothing(){}
    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    /*
     * Lesson 5-1 - Apply encapsulation
     * Clothing has a mininum price
     */
    final double MININUM_PRICE = 10;
    final double tax = 0.2;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = (price > MININUM_PRICE ? price : MININUM_PRICE);
    }

    public void setSize(String size) {
        this.size = size;
    }
    public double getPrice() {
        return price;
    }
    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "description" + description + ";price:" + price + ";size:" + size;
    }

    /**
     * Lesson 5-1 - Apply encapsulation
     * Tax will be within the Cloting
     * @return The cost value (price*tax)
     */
    public double getCostValue() {
        return getPrice() * (1+tax);
    }
}