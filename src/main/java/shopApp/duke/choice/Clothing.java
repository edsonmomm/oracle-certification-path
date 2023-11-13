package shopApp.duke.choice;

public class Clothing {
    String description;
    double price;

    public double getPrice() {
        return price;
    }

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

    @Override
    public String toString() {
        return description + ";" + price + ";" + size;
    }
}