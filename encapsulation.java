public class encapsulation {
    private String name;
    private int age;

    public void setStudent(int age, String name) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        encapsulation e = new encapsulation();
        e.setStudent(18,"Deepanshu");
        e.display();
    }
}