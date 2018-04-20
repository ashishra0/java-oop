interface printer {
    void scan(); // just define the method without the body.
}

interface copy extends printer{ // interface extends another interface.
    void xerox();
}

class printable implements copy {
    public void scan(){
        System.out.println("Scanning");
    }
    public void xerox(){
        System.out.println("taking a xerox");
    }

    public static void main(String args[]) {
        printable obj = new printable();
        obj.scan();
        obj.xerox();
    }
}