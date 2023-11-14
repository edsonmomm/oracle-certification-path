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

        // Switch - set customer size
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 4-1: Switch Demo");
        int measurement = 4;
        Lesson4_1_switch.executeSwitchDemo(customer1, measurement);
        System.out.println(customer1);
        System.out.println("Fit to S? " + customer1.fit("S"));

        // Array
        Lesson4_2_array.execureArrayDemo();

        // Encapsulation
        Lesson5_1_Encapsulation.executeEncaptulationDemo();

        // Overload
        Lesson5_2_Overload.executeOverloadDemo();
    }
}