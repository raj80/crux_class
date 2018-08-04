import java.util.Scanner;

public class ReverseArray {

    public static void main(String args[]){

        int[] arr = new int[5];
        inputArray(arr, 5);

    }

    static void inputArray (int[] arr, int size) {

        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("enter number " + i);
            arr[i] = scn.nextInt();
        }
    }

        static void printArray(int[] arr, int size){

            for(int i = 0; i<size; i++){
                System.out.println(arr[i]);

            }
        }
    }

