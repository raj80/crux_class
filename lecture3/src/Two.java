import java.util.Scanner;

public class Two {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scn.nextInt();
        int counter = 2;
        while (counter <= n) {
            int num = counter;
            int i = 2;
            while (i < num) {
                if (num % i == 0) {
                    break;
                }
                i = i + 1;

            }
            if (i == num) {
                System.out.println("prime " + num);

            }
            counter = counter + 1;
        }
    }
}