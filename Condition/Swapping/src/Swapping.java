import java.util.Scanner;

public class Swapping {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = scan.nextInt();
        System.out.println("enter value of b");
        int b =  scan.nextInt();

        int c = b;
        b = a;
        a = c;

        System.out.println("value of a is "+ a);
        System.out.println("value of b is "+b);

    }
}
