package shopApp.duke.choice;

public class Clothing {
    String description;
    double price;
    String size = "M";

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
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
        return description + ";" + price + ";" + size;
    }

    public double getCostValue(double tax) {
        return getPrice() * (1+tax);
    }
}