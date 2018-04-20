public class Person{
    public String name;
    public int rollno;
    public int telephone;
    
    public void details(String name, int rollno, int telephone) {
        System.out.println(name + rollno + telephone);
    }

    public void Name(String name) {
        this.name = name;
    }

    public void rollno(int rollno) {
        this.rollno = rollno;
    }

    public void telephone(int telephone) {
        this.telephone = telephone;
    }
}