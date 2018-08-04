import java.util.Scanner;

public class fibo_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("print a number ");
        int num = scn.nextInt();
        int a = 0;
        int b = 1;
        int sum;
        for (sum = 0; sum <= num; sum = a + b) {
            a = b;
            b = sum;
            System.out.println(b);
        }
    }
}
