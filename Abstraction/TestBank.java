// This is an example of Abstract class

abstract class Bank {
    abstract int getRateOfInterest();  // method defined without body.
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}

class HDFC extends Bank {
    int getRateOfInterest(){
        return 6;
    }
}

class TestBank {
    public static void main(String args[]){
        Bank b; // reference variable to access the inherited method
        b = new SBI();
        System.out.println("rate of interest is: "+ b.getRateOfInterest());
        b = new HDFC();
        System.out.println("rate of interest is: "+ b.getRateOfInterest());
    }
}