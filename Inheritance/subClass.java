class superClass {
    int num = 20;

    public void display() {
        System.out.println("This is a method in super class");
    }
}

public class subClass extends superClass {
    int num  = 10;

    public void display() {
        System.out.println("This is a method of subclass");
    }

    public void my_method() {
        subClass sub = new subClass();

        sub.display(); // invoking the display method of sub class.
        super.display(); // invoking the display method of super class.

        System.out.println("The value of num in sub class is "+ sub.num);
        System.out.println("The value of num in super class is "+ super.num);
    }

    public static void main(String args[]) {
        subClass obj = new subClass();
        obj.my_method();
    }
}