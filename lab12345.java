import java.util.Scanner;
public class lab12345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    
}
}
