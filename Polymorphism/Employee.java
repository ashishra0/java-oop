public class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() { 
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