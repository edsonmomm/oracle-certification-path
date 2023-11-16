package shopApp.duke.choice;

public class Customer {
    String name;
    String size;

    private Clothing[] items;

    public Customer() {}
    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, int measurement) {
        this.name = name;
        measure(measurement);
    }

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
        int clothingAmount = 0;
        if (items != null)
            clothingAmount = items.length;
        return "Name:"+getName()+";size:"+getSize()+";clothingAmount:"+clothingAmount;
    }


    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing item : this.getItems()) {
            System.out.println("Item:" + item);
            total += item.getCostValue();
        }
        return total;
    }

    public double getAverageCost() {
        double total = 0.0;
        int count = 0;
        for (Clothing item : this.getItems()) {
            count++;
            total += item.getCostValue();
        }
        return calculateAverage(count, total);
    }

    /**
     * Return the average for cloving that fits the customer
     * @return average
     */
    public double getAverageCostFit() {
        double total = 0.0;
        int count = 0;
        for (Clothing item : this.getItems()) {
            if (this.fit(item.getSize())) {
                count++;
                total += item.getCostValue();
            }
        }
        return calculateAverage(count, total);
    }

    private double calculateAverage(int count, double total) {
        double average = 0.0;
        try {
            System.out.println("total:" + total);
            System.out.println("count:" + count);
            // To force the division by zero (when total as double, return NaN - not a number)
            // As example, let's force the division using "int"
            average = ((int) total) / count;
        } catch (ArithmeticException e) {
            System.out.println("No items found");
        }
        return average;
    }
}