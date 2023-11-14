package lessons;

import shopApp.duke.choice.Clothing;
import shopApp.duke.choice.Customer;

/**
 * Lesson 6-1 - Constructors
 */
public class Lesson6_1_Constructor {

    public static void executeConstructorDemo(){
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 6-1: Constructors");

        Customer customer1 = new Customer("Customer1");
        Customer customer2 = new Customer("Customer2", 5);

        Clothing item1 = new Clothing("T-shirt white", 16.75, "M");
        customer1.setItems(new Clothing[] {item1});

        System.out.println("Constructor with only name: " + customer1);
        System.out.println("Constructor with name and size: " + customer2);
    }
}