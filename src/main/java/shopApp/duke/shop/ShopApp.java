package shopApp.duke.shop;

import lessons.Lesson3_primitiveTypes;
import shopApp.duke.choice.Customer;
import lessons.Lesson1Welcome;
import lessons.Lesson3_1;
import lessons.Lesson3_OperatorPrecedence;

public class ShopApp {
    public static void main(String[] args) {
        // Prints the Duke's Shop welcome message
        Lesson1Welcome.printWelcomeMessage();

        // Lesson 3.1 - Creates a customer with name
        Customer customer1 = Lesson3_1.createCustomerAndPrintName("Pinky");
        customer1.printGreetings();

        // Primitive types
        Lesson3_primitiveTypes lesson3 = new Lesson3_primitiveTypes();
        // Uses an override of toString to print all variables
        System.out.println(lesson3);

        // Precedence
        Lesson3_OperatorPrecedence.precedenceExample1();
        Lesson3_OperatorPrecedence.precedenceExample2();
        Lesson3_OperatorPrecedence.precedenceExample3();
    }
}