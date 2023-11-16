package lessons;

import shopApp.duke.choice.Clothing;

import java.util.Arrays;

/**
 * Lesson 8-2 - Implement the Comparable interface for Clothing class, to sort Clothing objects by their description
 */
public class Lesson8_2_Sort {
    public static void executeSortDemo() {
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 8-2: Sort using interface of Comparable");

        Clothing item1 = new Clothing("T-shirt white", 13.45, "S");
        Clothing item2 = new Clothing("T-shirt orange", 14.00, "M");
        Clothing item3 = new Clothing("T-shirt yellow", 14.00, "L");

        Clothing[] clothing = {item1, item2, item3};
        System.out.println("- List before sort -");
        for (Clothing item : clothing) {
            System.out.println(item);
        }
        System.out.println("- List after sort -");
        Arrays.sort(clothing);
        for (Clothing item : clothing) {
            System.out.println(item);
        }
    }
}
