package lessons;

import shopApp.duke.choice.Clothing;

/**
 * Operators Demo - Using numeric and text variables
 */
public class Lesson3_2 {

    public static void executeOperatorDemo() {
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 3-2: Operator Demo");
        double tax = 0.2, total;

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        // Print items
        System.out.println(item1);
        System.out.println(item2);

        //total = (item1.getPrice() + (item2.getPrice() * 2));
        total = (item1.getCostValue(tax) + (item2.getCostValue(tax) * 2));
        // take the tax
        //total = total + (total * tax);
        System.out.println("Total of 2 shirts + 1 jacked: " + total);
    }
}