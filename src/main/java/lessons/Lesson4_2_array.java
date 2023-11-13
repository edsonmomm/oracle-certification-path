package lessons;

import shopApp.duke.choice.Clothing;

/**
 * Lesson 4-2: Working with arrays.
 * Will some clothing for the customer and print the total cost
 * Different from the lesson, it was implemented a method to calculate the clothing cost value for each clothing piece
 */
public class Lesson4_2_array {

    // Create some clothes

    public static void execureArrayDemo() {
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 4-2: Array Demo");
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        Clothing[] clothingList = {item1, item2, item2};

        double tax = 0.2;
        double total = 0.0;
        for (Clothing clothing : clothingList) {
            total += clothing.getCostValue(tax);
        }

        System.out.println("Total of pieces: " + clothingList.length);
        System.out.println("Total cost: " + total);
    }
}