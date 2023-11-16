package lessons;

import shopApp.duke.choice.Clothing;
import shopApp.duke.choice.Customer;

public class Lesson7_1_Exception {
    public static void executeExceptionDemo() {
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 7-1: Exception");

        Customer customer = new Customer("Customer Exception Demo", 11);
        System.out.println(customer);

        Clothing item1 = new Clothing("T-shirt white", 13.45, "S");
        Clothing item2 = new Clothing("T-shirt orange", 14.00, "M");
        Clothing item3 = new Clothing("T-shirt yellow", 14.00, "L");
        customer.setItems(new Clothing[] {item1, item2, item3});
        System.out.println("Added 3 shirts of different sizes to customer items");

        System.out.println("Average of all items: " + customer.getAverageCost());
        System.out.println("Average of customer size: " + customer.getAverageCostFit());
    }
}
