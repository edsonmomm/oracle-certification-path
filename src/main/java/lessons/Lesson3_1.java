package lessons;

import shopApp.duke.choice.Customer;

/**
 * Working with string variables
 */
public class Lesson3_1 {
    /**
     * Creates a customer, print its name and return the Customer instance
     * @param customerName
     * @return
     */
    public static Customer createCustomerAndPrintName(String customerName) {
        Customer customer = new Customer();
        customer.setName(customerName);

        return customer;
    }

}
