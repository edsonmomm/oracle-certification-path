package lessons;

import shopApp.duke.choice.Clothing;

public class Lesson6_3_static {
    public static void executeStaticDemo() {
        System.out.println("-----------------------------------------------");
        System.out.println("Lesson 6-3: Static");

        // As min price and tax are public and static, It's possible to access them without instantiate the class;
        System.out.println("Minimum price: " + Clothing.MIN_PRICE);
        System.out.println("Tax: " + Clothing.tax);
    }
}
