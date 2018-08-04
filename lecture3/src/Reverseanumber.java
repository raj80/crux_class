import java.util.Scanner;

public class Reverseanumber {
    //    public static void main(String args []){
////        int Reverse=0;
////        int num =123;
////        int remainder=0;
////        while(num>0){
////            remainder=num%10;
////            num=num/10;
////            Reverse=Reverse*10+remainder;
////        }
////        System.out.println(Reverse);
////    }
    static int reversenumberrecursion(int num) {
        int reverse= 0;
        int remainder=0;
        if (num >0 ){
            remainder= num%10;

        }
        reverse=reverse*10+remainder;
        if (num==0){
            return reverse;
        }
        System.out.print(reverse);
        return reversenumberrecursion(num/10);



    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("print a number ");
        int num = scn.nextInt();
        reversenumberrecursion(num);
    }
}