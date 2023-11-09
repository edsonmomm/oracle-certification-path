package shopApp.duke.shop;

import shopApp.duke.choice.Customer;
import shopApp.duke.shop.lessons.Lesson1Welcome;
import shopApp.duke.shop.lessons.Lesson3_1;

public class ShopApp {
    public static void main(String[] args) {
        // Prints the Duke's Shop welcome message
        Lesson1Welcome.printWelcomeMessage();

        // Lesson 3.1 - Creates a customer with name
        Customer customer1 = Lesson3_1.createCustomerAndPrintName("Pinky");
        customer1.printGreetings();
    }
}