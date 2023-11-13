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
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 4-1: Switch Demo");
        switch (measurement) {
            case 1: case 2: case 3 :
                customer.setSize("S");
                break;
            case 4: case 5: case 6 :
                customer.setSize("M");
                break;
            case 7: case 8: case 9 :
                customer.setSize("L");
                break;
            default:
                customer.setSize("X");
        }
    }
}