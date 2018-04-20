package mypack; // name of the package.
import pack.*; // importing the package A which contains Class A.

class B {
    public static void main(String args[]) {
        A obj = new A();
        obj.msg();
    }
}