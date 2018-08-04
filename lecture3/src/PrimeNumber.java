import java.sql.SQLOutput;
    import java.util.Scanner;

public class PrimeNumber {
    //    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int num = scn.nextInt();
//        int i = 2;
//        while (i <= num) {
//            if (num % i == 0) {
//                System.out.println("not prime ");
//                break;
//            }
//            i = i + 1;
//
//            if (i == num) {
//                System.out.println("prime");
//                break;
//            }
//        }
//    }
    static int primenumberrecursion(int i, int num) {

        if (num % i == 0 && i != num) {


            System.out.println("not prime");
            return 0;
        }
        if (i == num) {
            System.out.println("Prime number");
            return 0;
        }
        return primenumberrecursion(i + 1, num);

    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("print a number ");
        int num = scn.nextInt();
        primenumberrecursion(2, num );


    }
}


