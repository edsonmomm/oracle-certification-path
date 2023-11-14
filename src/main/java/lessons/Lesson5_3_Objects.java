package lessons;

import shopApp.duke.choice.Clothing;
import shopApp.duke.choice.Customer;

public class Lesson5_3_Objects {

    public static void executeLessonObjectDemo() {
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 5-3: Objects Demo");

        Customer customer1 = Lesson3_1.createCustomerAndPrintName("Beth Blue");
        customer1.setSize(3);

        // Create some clothing for customer
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-shirt");
        item2.setPrice(13.5);
        item2.setSize("S");

        customer1.setItems(new Clothing[]{item1, item2, item2});

        System.out.println("Total of pieces: " + customer1.getItems().length);
        System.out.println("Total cost: " + customer1.getTotalClothingCost());

    }
}