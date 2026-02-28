import java.util.*;
class User {
    String name;
    int age;
    void setData(String n, int a) {
        name = n;
        age = a;
    }
    static void displayUser(User u) {
        System.out.println(u.name);
        System.out.println(u.age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int a = sc.nextInt();
        User u1 = new User();
        u1.setData(n, a);
        displayUser(u1);
    }
}
