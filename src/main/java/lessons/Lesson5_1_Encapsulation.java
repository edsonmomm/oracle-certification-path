package lessons;

import shopApp.duke.choice.Clothing;

/**
 * Lesson 5-1 - Encapsulation
 * Tax was moved into Clothing class, that also received a minimum price variable
 */
public class Lesson5_1_Encapsulation {

    public static void executeEncaptulationDemo() {
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 5-1: Apply encapsulation");

        Clothing item = new Clothing();
        item.setDescription("T-shirt");
        item.setSize("S");
        item.setPrice(5.0);
        System.out.println("Set the price to $5, less than minimum");
        System.out.println(item);

        System.out.println("Set the price to $15");
        item.setPrice(15);
        System.out.println(item);

    }
}
