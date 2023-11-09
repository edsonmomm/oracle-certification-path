package lessons;

/**
 * Explaining how operator precedence works <br>
 * Rules of precedence:
 * Operator within a pair of parentheses
 * Increment and decrement operators (++ or --)
 * Multiplication and divisions, evaluated from left to right
 * Addition and subtraction, evaluated from left to right
 *
 */
public class Lesson3_OperatorPrecedence {

    public static void precedenceExample1() {
        System.out.println("solving: int c = 25 - 5 * 4 / 2 - 10 + 4");
        int c = 25 - 5 * 4 / 2 - 10 + 4;
        // first * and / = 5*4/2 = 10
        // int c = 25 - 10 - 10 + 4;
        // int c = 9;
        System.out.println("Result: " + c);
    }

    public static void precedenceExample2() {
        System.out.println("solving: int c = 25 - 5 * 4 / 2 - 10 + 4 / 3 + 1");
        int c = 25 - 5 * 4 / 2 - 10 + 4 / 3 + 1;
        // first (5*4/2)
        // int c = 25 - 10 - 10 + 4 / 3 + 1;
        // now (4/3) = 1,3333 but is an int, so 1
        // int c = 25 - 10 - 10 + 1 + 1
        // int c = 7
        System.out.println("Result: " + c);
    }

    public static void precedenceExample3() {
        System.out.println("solving: (((25 - 5) * 4) / (2-10)) + 4");
        int c = (((25 - 5) * 4) / (2-10)) + 4;
        System.out.println("Result: " + c);
    }
}
