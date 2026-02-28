class student {
    int roll_number;
    String name;
    void display() {
        System.out.println("roll Number: " + roll_number);
        System.out.println("name: " + name);
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.roll_number = 590016618;
        s1.name = "Deepanshu";
        s1.display();

    }

}
