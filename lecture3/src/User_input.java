import java.util.Scanner;

public class User_input {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number to check whether it is prime or not");
        int n = scan.nextInt();
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                System.out.println("not prime");
                break;
            }
            i++;

        }
        {

        }
        if(i == n) {
            System.out.println("number is prime");
        }
    }
}