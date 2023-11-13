package shopApp.duke.choice;

public class Customer {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printGreetings() {
        System.out.println("Greetings " + getName());
    }
}
