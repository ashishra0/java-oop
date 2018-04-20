public class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number, double salary){
        super(name, address, number); // inheriting employee method of Parent class.
        setSalary(salary); // new method.
    }

    public void mailCheque(){ // implementing parent class method.
        System.out.println("Withing mailCheque of Salary class ");
        System.out.println("Mailing Cheque to " + getName() + " With salary " + getSalary());
    }

    public double getSalary() { // getter method
        return salary;
    }

    public void setSalary(double newSalary){ // setter method
            salary = newSalary;
    }

    public static void main(String args[]){
        Salary s = new Salary("Ashish", "Aundh", 8, 25000.0);
        Employee e = new Salary("John Adams", "NYC", 7, 23000.0);
        System.out.println("Call mailcheque using salary reference--");
        s.mailCheque();
        System.out.println("Call mailcheque using employee reference--");
        e.mailCheque();
        e.computePay(); // calling the method in parent class.
    }
}