abstract class Abstraction {
    private int rollNo;
    private String name;
    private double marks;

    abstract void display();

    public void setData(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}

class Student extends Abstraction {
    @Override
    void display() {
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Name: " + getName());
        System.out.println("Marks: " + getMarks());
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData(590016618, "DEEPANSHU", 85.5);
        s.display();
    }
}