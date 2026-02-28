class student1 {
    int roll_number;
    String name;

    void setData(int r, String n) {
        roll_number = r;
        name = n;
    }

    void display() {
        System.out.println("Roll Number: " + roll_number);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        student1 s1 = new Student1();
        s1.setData(590016618, "Deepanshu");
        s1.display();

        student1 s2 = new Student1();
        s2.setData(590017525, "Badri");
        s2.display();

        student1 s3 = new Student1();
        s3.setData(590017523, "Keval");
        s3.display();
    }
}
