
// Example of Abstract Class

public abstract class Employee { // This is now an Abstract class
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) { // normal class
        System.out.println("Constructing an employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() { // Abstract methods
        System.out.println("Computing pay for " + getName());
        return 0.0;
    }

    public void mailCheque() {
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() { // getter method
        return name;
    }
}