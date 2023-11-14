package lessons;

import shopApp.duke.choice.Clothing;
import shopApp.duke.choice.Customer;

/**
 * Lesson 4-2 into 4-4: Working with arrays.
 * Will some clothing for the customer and print the total cost
 * Different from the lesson, it was implemented a method to calculate the clothing cost value for each clothing piece
 */
public class Lesson4_2_array {

    // Create some clothes

    public static void execureArrayDemo() {
        Customer customer1 = Lesson3_1.createCustomerAndPrintName("Pinky");
        // Sets customer clothing size
        Lesson4_1_switch.executeSwitchDemo(customer1, 3);

        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 4-2: Array Demo");
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-shirt");
        item2.setPrice(13.5);
        item2.setSize("S");

        customer1.setItems(new Clothing[] {item1, item2, item2});

        double total = customer1.getTotalClothingCost();
        System.out.println("Total of pieces: " + customer1.getItems().length);
        System.out.println("Total cost: " + total);

        System.out.println("Now, only for clothes that match customers size, and total less than $15.");
        total = 0.0;
        int itemSameSize = 0;
        for (Clothing item : customer1.getItems()) {
            if (customer1.getSize().equals(item.getSize())) {
                System.out.println("Item:" + item);
                total += item.getCostValue();
                itemSameSize++;
            }
            System.out.println("Total cost2: " + total);
            if (total >= 15)
                break;
        }
        System.out.println("Total of pieces: " + itemSameSize);
        System.out.println("Total cost: " + total);
    }
}