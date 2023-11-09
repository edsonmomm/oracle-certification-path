package shopApp.duke.shop.lessons;

/**
 * Explaining how operator precedence works <br>
 * Rules of precedence:
 * Operator within a pair of parentheses
 * Increment and decrement operators (++ or --)
 * Multiplication and divisions, evaluated from left to right
 * Addition and subtraction, evaluated from left to right
 *
 */
public class Lesson3_OperatorPrecendence {

    public static void precedenceExample() {
        System.out.println("solving: int c = 25 - 5 * 4 / 2 - 10 + 4");
        int c = 25 - 5 * 4 / 2 - 10 + 4;
        System.out.println("Result: " + c);
    }
}
