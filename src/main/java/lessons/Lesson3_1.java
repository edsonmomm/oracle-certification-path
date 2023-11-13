package lessons;

import shopApp.duke.choice.Customer;

/**
 * Working with string variables
 */
public class Lesson3_1 {
    /**
     * Creates a customer, print its name and return the Customer instance
     * @param customerName the name for customer
     * @return customer's instance
     */
    public static Customer createCustomerAndPrintName(String customerName) {
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 3-1: Create a customer");
        Customer customer = new Customer();
        customer.setName(customerName);

        return customer;
    }
}
