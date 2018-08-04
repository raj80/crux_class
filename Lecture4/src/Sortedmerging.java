import java.util.Scanner;

public class Sortedmerging {
    static void inputarray(int []arr){
        Scanner scanner = new Scanner(System.in );
        for (int i=0; i<arr.length; i++){
            System.out.println("enter number "+ i);
            arr [i]= scanner.nextInt();
        }
    }
    static void printarray (int []arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int inputsize(){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter size");
        int size= scn.nextInt();
        return size;
    }
        static int[] merge ( int[] arr1, int[] arr2){
            int[] arr3 = new int[arr1.length + arr2.length];
            int a = 0;
            int b = 0;
            int c = 0;
            for (int i = 0; i < arr1.length + arr2.length; i++) {
                if (a < arr1.length && b < arr2.length) {
                    if (arr1[a] < arr2[b]) {
                        arr3[c] = arr1[a];
                        c++;
                        a++;
                    } else {
                        arr3[c] = arr2[b];
                        c++;
                        b++;
                    }

                }
                if (a < arr1.length && b >= arr2.length) {
                    arr3[c] = arr1[a];
                    c++;
                    a++;
                }
                if (b < arr2.length && a >= arr1.length) {
                    arr3[c] = arr2[b];
                    c++;
                    b++;
                }
            }
            return arr3;
        }


    public static void main (String[] args){
        int sizeA=inputsize();
            int []arrA= new int [3];
            inputarray(arrA);

        int sizeB=inputsize();
            int []arrB=new int [3];
        inputarray(arrB);

        int sizeC=inputsize();
            int []arrC= new int [3];
        inputarray(arrC);






            int []arrD= merge(arrA, arrB);
        int []arrE= merge(arrC, arrD);
        //int []arrF= merge(arrZ, arrE);
printarray(arrE);

    }

        }














