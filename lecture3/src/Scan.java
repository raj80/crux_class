import java.util.Scanner;

public class Scan {public static void main (String args[])
{
//    Scanner scn= new Scanner (System.in);
//    System.out.println("enter any number");
//int num =scn.nextInt();
//System.out.println("you entered"+num);

    Scanner scn=new Scanner (System.in) ;
    System.out.println("enter a number ");
    int num=scn.nextInt();
    int i=1;
    while(i*i<=num){
        System.out.println("perfect square of "+ i + " is "+ i*i );
        i=i+1;
    }
}
}
