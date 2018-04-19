public class InterfaceExample implements Animal {
    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs () {
        return 0;
    }

    public static void main(String args[]) {
        InterfaceExample obj = new InterfaceExample();
        obj.eat();
        obj.travel();
        obj.noOfLegs();
    }
}