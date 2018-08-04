import java.util.Scanner;

public class Nnumbers {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rev = numbers(n);
        System.out.println(rev);
    }

    static int numbers(int n) {
        int rev = 0;
        int rem = 0;
        for (int num = n; num > 0; num = num / 10) {
            rem = num / 10;
            rev = rev * 10 + rem;
        }
        return rev;

    }
}