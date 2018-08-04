import java.util.Scanner;

public class Arrayandfunctions {


    static void Inputarray(int[] arr, int size) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < size; i = i + 1) {
            System.out.println("Enter a number" + i);
            arr[i] = scn.nextInt();
        }
    }

    static void Printarray(int[] arr, int size) {
        for (int i = 0; i < size; i = i + 1) {
            System.out.println(arr[i]);
        }

    }
//    static void repeatArray(int []arr,int size) {
//        for (int i = 0; i < size; i++){
//            if(i +1!=arr[i]){
//                System.out.println(" duplicate nubmer is "+ arr [i] + "missing number is" + (arr [i] +1 ));
//                break;
//
//            }
//        }
//    }
//    static void numberSum (int []arr, int size,int num ) {
//        int start = 0;
//        int end = size - 1;
//        int flag = 0;
//        while (start < end) {
//            if (arr[start] + arr[end] == num) {
//                System.out.println("found");
//
//                flag = 1;
//                break;
//            } else {
//                if (arr[start] + arr[end] < num) {
//                    start = start + 1;
//                } else {
//                    end = end - 1;
//                }
//
//            }
//        }
//        if (flag == 0) {
//            System.out.println("not found");
//        }
//    }

        //static  int binarySearch

        //static int[] multiplybytwo(int arr[], int size) {
        //   for (int i = 0; i < size; i = i + 1) {
        //     arr[i]  = arr[i] * 2;
        //  }
        //return arr;}

        //    static int[] Reversarray(int arr[], int size) {
//        for (int i = 0; i <= size / 2; i++) {
//            int tmp = arr[i];
//            arr[i] = arr[size - i - 1];
//            arr[size - i - 1] = tmp;
//        }
//        return arr;
//    }
//    static int largestArray(int arr[] ,int size){
//        int largestnumber=arr[0];
//        for(int i=1; i<size; i++){                                                   
//            if (largestnumber < arr[i]){
//                largestnumber=arr[i];
//            }
//
//        }
//        return largestnumber;
//    }
//    static int []Sumarray(int []arr,int size){
//        for(int i=1; i<size; i++) {
//            arr[i] = arr[i] + arr[i - 1];
//        }
//        //always write return after the for loop
//        return arr ;
//    }
//
//    static void search (int[] arr,int size,int num)
//    {
//        for(int i=0; i<size;i++){
//            if(arr [i]==num)       {
//                System.out.println("found at "+ i);
//                             break;
//            }
//            else{
//                System.out.println("print not found");
//                break;
//
//        }
// check whether a number is sum of either 2 of the arrays
        // to pick up the 2 numbers u have to take 2 loops
//    static void search(int[] arr, int size, int num) {
//        int i;
//        for (i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                // i ki value 0 h or j ki value 0+1 h
//                if (arr[i] + arr[j] == num) {
//                    System.out.println("number found at " + i + " " + j);
//
//                }
//
//            }
//        }

        //    }
    static int []rotateArray(int []arr, int size, int num ){
        for(int j=0; j<num; j++){
            for( int i =0; i< size -1; i++){
                int tmp=arr[i];
                arr [i]= arr [i+1];
                arr [ i +1]= tmp;
            }
        }
        return arr;
    }
//

//    static  void selectionSorting(int arr [], int size ) {
//        for (int i = 0; i < size; i++) {
//            int min = i;
//            for (int j = i + 1; j < size; j++) {
//                if( arr[j]< arr[min]){
//                    min =j;
//                }
//            }
//if (min !=i){
//                int tmp= arr[i];
//                arr[i]=arr[min];
//                arr [min]=tmp;
//}
//        }
//    }
//    static void localMinima(int arr[] , int size){
//        int flag=0;
//        for( int i =1; i<size- 1; i ++){
//            if (arr[i+1] > arr[i] && arr[i-1]>arr[i]){
//                flag=1;
//                System.out.println(" local minima is "+ arr[i]);
//            }
//
//        }
//        if(arr[0]< arr[1]){
//            flag=1;
//            System.out.println("local minima found at "+ arr[0]);
//        }
//        if( arr[size-1]<arr[size-2])
//        {
//            flag=1;
//            System.out.println(" local minima found at"+ arr[size-1]);
//        }
//        if(flag==0){
//            System.out.println(" there is no local minima ");
//        }
//
//    }
//
//    static void insertionSorting (int arr[], int size){
//        for(int i=1;i<size;i++){
//            for(int j=i; j>=1;j--){
//                if(arr[j]< arr[j-1])
//                {
//                    int tmp=arr[j];
//                    arr[j] = arr [j-1];
//                arr[j-1]= tmp;
//
//                }
//
//            }
//
//        }
//
//
//    }
//    static void majorityElement( int arr[], int size){
//        int flag=0;
//        for( int i=0; i< size/2;  i++){
//            if (arr[i]==arr [(size/2)+i]){
//                System.out.println("majority element is " + arr[i] );
//                flag=1;
//                break;
//            }
//
//        }
//        if(flag==0) {
//
//            System.out.println(" there is no majority element ");
//
//        }
//    }

//    static void bubbleSorting(int arr [], int size){
//        for ( int i =0; i<size;  i++){
//            for(int j=0; j<(size-i-1);j++){
//                   if( arr [j]> arr[j+1]){
//                   int tmp= arr [j];
//                   arr[j]= arr[j+1];
//                   arr[j+1]= tmp;
//                }
//            }
//        }
//
//    }
//    static void recursion
//        for(int i=0;i<)

        public static void main (String args[]){
            int[] arr = new int[5];
            Inputarray(arr, 5);
            Scanner scn = new Scanner(System.in);
            System.out.println("enter a number to search");
           int num = scn.nextInt();
           // repeatArray(arr, 5 );
//            numberSum(arr, 5, num);
            //search(arr, 5, num);
//        int pos = binarySearch(arr, 10, num);
//        if (pos == -1) {
//            System.out.println("NOT FOUND");
//        } else {
//            System.out.println("found at position " + pos);
                rotateArray (arr, 5, num);
           // selectionSorting(arr, 5);
           // insertionSorting(arr ,5);

          //
            // bubbleSorting(arr,5);
           // majorityElement(arr, 5);
      //      localMinima(arr, 5);
            Printarray(arr, 5);
        }
    }



//             int largestnu     mber=largestArray(arr,5);
//       System.out.println("largest number is"+ largestnumber);
//        //Reversarray(arr, 5);
         // Sumarray(arr,5);




