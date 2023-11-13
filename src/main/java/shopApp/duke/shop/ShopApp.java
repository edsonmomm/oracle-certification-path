package shopApp.duke.shop;

import lessons.*;
import shopApp.duke.choice.Customer;

public class ShopApp {
    public static void main(String[] args) {
        // Prints the Duke's Shop welcome message
        Lesson1Welcome.printWelcomeMessage();

        // Lesson 3.1 - Creates a customer with name
        Customer customer1 = Lesson3_1.createCustomerAndPrintName("Pinky");
        customer1.printGreetings();

        // Primitive types
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 3: Primitive types");
        Lesson3_primitiveTypes lesson3 = new Lesson3_primitiveTypes();
        // Uses an override of toString to print all variables
        System.out.println(lesson3);

        // Precedence
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 3: Operator Precedence");
        Lesson3_OperatorPrecedence.precedenceExample1();
        Lesson3_OperatorPrecedence.precedenceExample2();
        Lesson3_OperatorPrecedence.precedenceExample3();

        // Operators
        Lesson3_2.executeOperatorDemo();

        int measurement = 4;
        // Switch - set customer size
        Lesson4_1_switch.executeSwitchDemo(customer1, measurement);
        System.out.println(customer1);

        // Array
        Lesson4_2_array.execureArrayDemo();
    }
}