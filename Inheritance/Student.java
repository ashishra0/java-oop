public class Student extends Person {
    public void subject(String subject){
        System.out.println("Student " + name + "Subjects are: " + subject);
    }

    public void marks(int marks) {
        System.out.println("Student" + name + "Marks are: " + marks);
    }

    public static void main(String args[]) {
        Student obj = new Student();
        obj.Name("ashish");
        obj.rollno(8);
        obj.telephone(9822010);
        obj.subject("History");
        obj.marks(90);
        obj.details("Ashish", 8, 9822010);
    }
}