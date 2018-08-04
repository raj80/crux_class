import java.util.Scanner;

public class twoDarray {

    static void input2darray(int[][] arr, int row, int col) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter number for " + i + " " + j);
                arr[i][j] = scn.nextInt();
            }
        }

    }

    static void print2darray(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            // pehle vaale column loop ke baad chalega dusri row ka sout
            System.out.println();

        }
    }
//

    public static void main (String args[]){
        int[][] arr = new int[3][3];
        int row = 3;
        int col = 3;
        input2darray(arr, row, col);

        //halfArray(arr, row, col);
        // spiralPrint(arr, col, row);
        // int sum = diagnolSum(arr, row, col);
        //  System.out.println(sum);
        //oddeven( arr , row, col);
        //print2darray(arr, row, col);
    }

}

//
//    static void spiralPrint(int[][] arr, int row, int col) {
//        for (int i = 0; i < row; i++) {
//            if (i % 2 == 0) {
//
//           for (int j = 0; j < col; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            } else {
//                for (int j = col - 1; j > 0; j--) {
//                    System.out.print(arr[i][j] + " ");
//
//                }
//            }
//        }
//    }

//        static int[][] oddeven( int [][] arr , int row , int col ){
//        for( int i=0; i< row; i++){
//            for (int j=0; j< col; j++){
//
//                if ( arr[i][j] %2==0){
//                    System.out.println(arr[i][j] +"is even number ");
//                } else {
//                    System.out.println(arr[i][j] + " is a odd number ");
//                }
//
//            }
//    }
//    return arr;
//        }


//static int diagnolSum(int [][]arr, int row , int col){
//    int sum=0;
//    for(int i=0; i<row; i++ ){
//        for( int j=0; j<col; j++){
//            if(i==j){
//                sum=sum+ arr[i][j];
//            }
//        }
//    }
//    return sum;
//}






