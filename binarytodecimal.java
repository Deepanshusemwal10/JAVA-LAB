import java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int base = 1;  

        while (binary > 0) {
            int remainder= binary % 10;   
            decimal = decimal + remainder * base;
            base = base * 2;             
            binary = binary / 10;          
        }

        System.out.println("Decimal = " + decimal);
    }
}


