package lessons;

import shopApp.duke.choice.Customer;

/**
 * Flow control Demo - Switch
 */
public class Lesson4_1_switch {
    /**
     * Receives the customer and sets the size for clothing

     * @param customer Customer instance
     * @param measurement the current client measurement
     */
    public static void executeSwitchDemo(Customer customer, int measurement) {
        // The switch was moved to customer class
        customer.measure(measurement);
    }
}