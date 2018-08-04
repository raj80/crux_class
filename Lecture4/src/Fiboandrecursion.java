import java.util.Scanner;

public class Fiboandrecursion {
    static int FiboOfNum(int a, int b, int i , int num ) {
        if (i==num){
        return a+b;
        }
        int c= FiboOfNum(b,a+b, i+1,num );
                return c;

    }
//        int c = 0;
//        if (num == 1) {
//            c = 0;
//        }
//        if (num == 2) {
//            c = 1;
//        }
//        for (int i = 3; i <= num; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//        }
//        return c;



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("print a number ");
        int num = scn.nextInt();
        int x = FiboOfNum(0 , 1 , 3 ,num);
        System.out.println(x);
        }
    }
