import java.util.Scanner;

public class recursionadditionnumbers {
//
//    static int sumOfNNumbers5(int i ,int num ){
//    if (i==num){
//        return i;
//    }
//
//
//
//
//    }
//    static int sumOfNNumbers4(int i ,int num ){
//        if (i==num){
//            return i;
//        }
//        int sum =i+sumOfNNumbers5(5,num );
//        return sum;
//
//
//
//    }static int sumOfNNumbers3(int i ,int num ){
//        if (i==num){
//            return i;
//        }
//        int sum =i+sumOfNNumbers4(4,num );
//        return sum;
//
//
//
//    }static int sumOfNNumbers2(int i ,int num ){
//        if (i==num){
//            return i;
//        }
//        int sum =i+sumOfNNumbers3(3,num );
//        return sum;
//
//
//
//    }static int sumOfNNumbers1(int i ,int num ){
//        if (i==num){
//            return i;
//        }
//        int sum =i+sumOfNNumbers2(/*i=i+1*/2,num );
//        return sum;
//
//
//
//    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter ur number");
        int num=scn.nextInt();
        //int sum =sumOfNNumbers1(1 ,num);
        int product=productofnnumber(1,num);
        System.out.println(product);
    }
    static int productofnnumber(int i ,int num){
        if (i==num) {
            return i;
        }
        int product=i*productofnnumber(i+1,num);
            return product;

    }









}

//        System.out.println("print a number ");
//        int m = scn.nextInt();
//        for (int i = 0;i<=m;i=i+1 ){
//            System.out.println(i);
//        }
//    }
//}
