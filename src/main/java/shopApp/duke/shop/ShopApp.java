package shopApp.duke.shop;

import shopApp.duke.choice.Customer;
import shopApp.duke.shop.lessons.Lesson1Welcome;
import shopApp.duke.shop.lessons.Lesson3_1;
import shopApp.duke.shop.lessons.Lesson3_OperatorPrecendence;
import shopApp.duke.shop.lessons.Lesson3_primitiveTypes;

public class ShopApp {
    public static void main(String[] args) {
        // Prints the Duke's Shop welcome message
        Lesson1Welcome.printWelcomeMessage();

        // Lesson 3.1 - Creates a customer with name
        Customer customer1 = Lesson3_1.createCustomerAndPrintName("Pinky");
        customer1.printGreetings();

        // Primitive types
        //Lesson3_primitiveTypes lesson3 = new Lesson3_primitiveTypes();
        //System.out.println(lesson3);

        // Precedence
        Lesson3_OperatorPrecendence.precedenceExample();
    }
}