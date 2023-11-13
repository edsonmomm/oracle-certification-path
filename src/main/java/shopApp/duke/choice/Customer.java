package shopApp.duke.choice;

public class Customer {
    String name;
    String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printGreetings() {
        System.out.println("Greetings " + getName());
    }

    public String toString() {
        return "Name:"+getName()+";size:"+getSize();
    }
}
