import java.util.Scanner;

public class TwoDArray {

    public static void main(String args[]) {
        int[][] arr = new int[3];
        int[][] arra = new int[3][3];
        int array[][] = new int[3][3];

        int row = 3;
        int col = 3;
        input2DArray(arr,arra,row, col);
        productArray(arr,arra,array, row,col);
//        int sum= diagonalSum(arr,row,col);
//        System.out.println("sum of diagonal is  " + sum);

//        evenOrOdd(arr,row,col);
        spiralPrint(arr, row, col);

        print2DArray(array,arra, row, col);
        halfArray(arr, row, col);
//        transpose(arr, row, col);


    }


//    static int totalPath(int[][] arr, int row, int col){
//
//        for (int i = 0;  i<row; i++ ){
//            arr[i][0]=1;
//        }
//
//        for (int i=0; i<col; i++){
//            arr[0][i]=1;
//        }
//
//        for (int i=1; i<row; i++){
//            for (int)
//        }
//    }




    static void input2DArray(int[][] arr, int [][] arra,int row, int col) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter number for " + i + " " + j + "  ");
                arr[i][j] = scn.nextInt();
            }
            System.out.println();

        }

        for (int a = 0; a < row; a++) {
            for (int b = 0; b < col; b++) {
                System.out.print("Enter number for " + a + " " + b + "  ");
                arra[a][b] = scn.nextInt();
            }
            System.out.println();

        }
    }

    static void spiralPrint(int[][] arr, int row, int col) {

        for (int i = 0; i < row; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < col; j++) {

                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            } else {
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();


    }

    static void productArray(int[][] arr,int[][] arra, int [][] array,int row, int col){



        for (int i = 0; i<row; i++){
            for (int j = 0; j<row; j++){
                int sum = 0;
                for (int k = 0; k<col; k++){
                    sum = sum + arr[i][k]*arra[k][j];

                }
                array[i][j] = sum;
            }

        }


    }

    static void print2DArray( int[][] array,int [][] arra,int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int a = 0; a < row; a++) {
            for (int b = 0; b < col; b++) {
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

//    static void transpose(int[][] arr, int row, int col) {
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(arr[j][i] + " ");
//            }
//            System.out.println();
//        }
//    }

    static void halfArray(int[][] arr, int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col - i; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }

//    static int diagonalSum(int[][]arr, int row, int col){
//
//        int sum = 0;
//        for (int i = 0; i<row; i++){
//            for (int j =0; j<col; j++){
//                if (i==j){
//                    sum = sum + arr[i][j];
//                }
//            }
//        }
//        return sum;
//    }

//    static void evenOrOdd (int[][] arr, int row, int col) {
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (arr[i][j] % 2 == 0) {
//                    System.out.println(arr[i][j] + " is even a number");
//                } else {
//                    System.out.println(arr[i][j] + " is a odd number");
//                }
//
//            }
//
//
//        }
//    }
}
