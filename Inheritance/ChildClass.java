class Parentclass {
    int age;

    Parentclass(int age){ // Constructor
        this.age = age;
    }

    public void getAge() {
        System.out.println("The age is " + age);
    }
}

public class ChildClass extends Parentclass {
    ChildClass(int age) { // Constructors
        super(age);
    }

    public static void main(String args[]) {
        ChildClass obj = new ChildClass(24);
        obj.getAge();
    }
}

