import java.util.Scanner;

public class Swapping {
    public static void main(String args[])
    {Scanner scn=new Scanner (System.in);
        System.out.println("enter a value of a");
        int a=scn.nextInt();

        System.out.println("enter a value of b");
        int b=scn.nextInt();
        int tmp=b;

        b=a;
        a=tmp;
        System.out.println("value of a is"+a);
        System.out.println("value of b is "+b);
    }
    /*for loop
    for(initialise;condition;increment)
     */
}
