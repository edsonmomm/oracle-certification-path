package shopApp.duke.choice;

public class Customer {
    String name;
    String size;

    private Clothing[] items;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void setSize(int intSize) {
        measure(intSize);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothing[] getItems() {
        return items;
    }

    public void setItems(Clothing[] items) {
        this.items = items;
    }

    /**
     * Define the customer clothing new size from the value of measurement
     * @param measurement int
     */
    private void measure(int measurement) {
        switch (measurement) {
            case 1: case 2: case 3 :
                setSize("S");
                break;
            case 4: case 5: case 6 :
                setSize("M");
                break;
            case 7: case 8: case 9 :
                setSize("L");
                break;
            default:
                setSize("X");
        }
    }

    public void printGreetings() {
        System.out.println("Greetings " + getName());
    }

    public boolean fit(String sizeToCompare) {
        return size.equals(sizeToCompare);
    }
    public String toString() {
        return "Name:"+getName()+";size:"+getSize();
    }
}
