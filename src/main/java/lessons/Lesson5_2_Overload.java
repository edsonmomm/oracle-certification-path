package lessons;

import shopApp.duke.choice.Customer;

/**
 * Lesson 5-2 - Work with method overload
 * Implements 2 methods to set customer's size.
 */
public class Lesson5_2_Overload {
    public static void executeOverloadDemo() {
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 5-2: Overload");

        Customer customer = new Customer();
        customer.setName("John Green");
        customer.setSize("S");
        System.out.println("With size set from string(S): " + customer);
        customer.setSize(4);
        System.out.println("With size set from int(5): " + customer);
    }
}
