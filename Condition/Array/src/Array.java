import java.util.Scanner;

public class Array {

    static void inputArray(int[] arr, int size) {
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.println("enter number " + (i + 1));
            arr[i] = scn.nextInt();
        }


    }

    static void printArray(int[] arr, int size) {

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }
    }

//    static void numberSum(int[] arr, int size, int num) {
//        int start = 0;
//        int end = size - 1;
//        int flag = 0;
//        while (start < end) {
//            if (arr[start] + arr[end] == num) {
//                System.out.println("found");
//                flag = 1;
//                break;
//            } else {
//                if (arr[start] + arr[end] < num) {
//                    start = start + 1;
//                } else {
//                    end = end - 1;
//                }
//            }
//            if (flag == 0) {
//                System.out.println("not found");
//                break;
//            }
//        }
//
//
//    }

//    static void repeatArray(int[] arr, int size) {
//        for (int i = 0; i < size; i++) {
//            if (i + 1 != arr[i]) {
//                System.out.println("reapt number is " + arr[i]);
//                break;
//            }
//        }
//    }

//    static void repeatArrayDs(int[] arr, int size){
//
//        int
//
//
//
//    }



//    static int largestArray(int arr[], int size){
//        int largest = arr[0];
//        for (int i = 1; i<size; i++){
//            if(largest< arr[i]){
//                largest = arr[i];
//            }
//
//
//        }
//        return largest;
//    }

//    static int[] multiplyTwo(int arr[], int size){
//        for(int i=0; i< size; i++){
//            arr[i]= arr[i]*2;
//        }
//        return arr;
//    }

//    static int[] addNumber(int[] arr, int size) {
//        int number = 0;
//
//        for (int i = 0; i < size; i++) {
//            number = number + arr[i];
//            arr[i]=number;
//
//        }
//
//
//        return arr;
//    }

//    static void search(int [] arr, int size, int num){
//        int i;
//        for (i=0; i<size; i++){
//            if (num==arr[i]){
//                System.out.println("found array "+num);
//                break;
//            }

//        }
//        if (i==size){
//            System.out.println("not found");
//
//        }
//
//    }

//    static void addSearch(int[] arr, int size, int num) {
//        int i;
//        for (i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (arr[i] + arr[j] == num) {
//                    System.out.println("number found " + i + " and " + j);
//                }
//
//
//            }
//
//        }
//        if (i == size) {
//            System.out.println("not found");
//
//
//        }
//
//
//    }

    //    static int[] rotateArray(int[] arr, int size, int num){
//        for (int i = 0; i<num; i++){
//            for (int j = 1+i; j<size-1; i++){
//
//                int temp =arr[i];
//                arr[i]= arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        return arr;
//
//    }
//    static int[] multibyTwo(int[] arr, int size) {
//        for (int i = 0; i < size; i++) {
//            arr[i] = arr[i] * 2;
//        }
//        return arr;
//    }

//    static int startbinarySearch(int arr[], int size, int num) {
//
//        int start = 0;
//        int end = size - 1;
//        int pos = -1;
//        while (start <= end) {
//
//            int mid = (start + end) / 2;
//            if (arr[mid] == num) {
//
//                pos = mid;
//                break;
//            } else {
//                if (arr[mid] < num) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//        }
//        return pos;
//    }
//
//    static int endbinarySearch(int arr[], int size, int num) {
//
//        int start = 0;
//        int end = size - 1;
//        int pos = -1;
//        while (start <= end) {
//
//            int mid = (start + end) / 2;
//            if (arr[mid] == num) {
//
//                pos = mid;
//                break;
//            } else {
//                if (arr[mid] < num) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//        }
//        return pos;
//    }

    //    static void localMinima(int arr[], int size) {
//        int flag = 0;
//        for (int i = 1; i < size-1; i++) {
//            if (arr[i + 1] > arr[i] && arr[i-1]>arr[i]) {
//                System.out.println("local minima is "+arr[i]);
//                flag=1;
//            }
//        }
//
//        if (arr[0] < arr[1]){
//            flag =1;
//            System.out.println("local minima found at "+arr[0]);
//        }
//        if (arr[size-1]>arr[size-2]){
//            flag = 1;
//            System.out.println("local minima found at "+arr[size-1]);
//        }
//        if (flag==0){
//            System.out.println("there is no local minima");
//        }
//    }
//    static int sumOfN(int num) {
//
//        int sum = 0;
//
//        for (int i = 0; i <= num; i++) {
//            sum = sum + i;
//        }
//
//        return sum;
//
//
//    }

//    static void majorityElement (int arr[], int size){
//        int flag =0;
//        for (int i=0; i<size/2; i++){
//            int nextElement= i+(size/2);
//            if(arr[i]==arr[nextElement]){
//                System.out.println("majority element is "+arr[i]);
//                flag = 1;
//                break;
//            }
//
//        }
//        if (flag==0){
//            System.out.println("there is no majority element");
//        }
//
//
//
//    }

//    static void selectionSort(int arr[], int size) {
//
//        for (int i = 0; i < size; i++) {
//            int min = i;
//            for (int j = i + 1; j < size; j++) {
//                if (arr[j] < arr[min]) {
//
//
//                    min = j;
//                }
//                if (min != i) {
//                    int tmp = arr[i];
//                    arr[i] = arr[min];
//                    arr[min] = tmp;
//                }
//
//
//            }
//        }
//
//    }

//    static void insertionSort(int arr[], int size) {
//        for (int i = 1; i < size; i++) {
//            for (int j = i; j >= 1; j--) {
//                if (arr[j] < arr[j - 1]) {
//
//                    int tmp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = tmp;
//
//                }
//            }
//        }
//
//    }

//      static void bubbleSort(int arr[], int size){
//
//        for (int i = 0; i < size; i++){
//
//            for (int j=0; j<(size-i-1); j++){
//
//                if (arr[j]>arr[j+1]){
//
//                    int tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                }
//            }
//        }
//
//
//
//      }

//    static int sumOfNumber(int i, int num){
//        if(i==num){
//            return i;
//
//        }
//        int sum = i + sumOfNumber(i+1,5);
//        return sum;
//    }

//    static int productOfNumber(int i, int num){
//
//        if (i==num){
//            return i;
//        }
//        int sum = i *productOfNumber(i+1,5);
//        return sum;
//    }

    //    static int fibonacciNumber(int a,int b,int num){
//
//        int c =0;
//        if(num==1){
//            c=a;
//        }
//        if(num ==2){
//            c=b;
//        }
//        for (int i =3; i<=num; i++){
//            c=a+b;
//            b=c;
//        }
//        return c;
//
//    }
    //    static int[] reverseArray(int arr[], int size) {
//        for (int i = 0; i < size / 2; i++) {
//
//            int temp = arr[i];
//            arr[i]= arr[size- i -1];
//            arr[size-i-1] = temp;
//
//        }
//
//        return arr;
//
// }
    static void reverse(int arr[],int i, int size){

        if (i<size-i-1){
            int temp = arr[i];
            arr[i]= arr[size- i -1];
            arr[size-i-1] = temp;
            reverse(arr,i+1,size);
        }

    }
//    static int palindrome(int [] arr, int f, int l){
//
//        if (f>=l){
//            return 1;
//        }
//        int flag = 0;
//        if (arr[f] == arr[l]){
//            flag = pallindrom(arr,f+1,l-1);
//        }
//        return flag;
//
//    }
//    static int prime(int i, int num) {
//
//        if (num % i == 0 && i != num) {
//            System.out.println("not prime");
//            return 0;
//        }
//
//
//
//        if (num == i) {
//            System.out.println("no. is prime");
//            return 0;
//        }
//
//        return prime(i+1,num);
//
//
//    }

//    static int fibRec(int a, int b, int i, int num) {
//
//
//        if (num == 1) {
//            return a;
//        }
//        if (num == 2) {
//
//
//            return b;
//        }
//
//        if (i == num) {
//            return a + b;
//
//        }
//        int c = fibRec(b, a + b, i + 1, num);
//        return c;
//
//    }

//    static void reverseArray() {
//
//
//    }


    public static void main(String args[]) {

        int size = 5;

        int[] arr = new int[size];

        inputArray(arr, size);

        reverse(arr,0,size);



//        int flag = pallindrom(arr, 0,size-1);
//        if (flag==1){
//            System.out.println("pallindrom");
//        }
//        else {
//            System.out.println("not pallindrom");
//        }

//        Scanner scn = new Scanner(System.in);
//        System.out.println("enter number to search");
//        int num = scn.nextInt();
//        int sum = productOfNumber(1,5);
//        int sum = fibRec(0, 1, 3, num);
//        System.out.println("sum of " + num + " number is " + sum);
        ////        repeatArray(arr,5);
//        int pos = binarySearch(arr, 10, num);
//        if (pos == -1) {
//            System.out.println("not found");
//        } else {
//            System.out.println("found at position" + pos);
//        }
//        int[] multi=multiplyTwo(arr,5);
//        System.out.println(multi);


        // arr = multiplyTwo(arr, 5);
        // arr =    reverseArray(arr, 5);
//       int largestNumber=largestArray(arr, 5);
//        System.out.println("largest number is "+ latgestNumber);
//        int[] sumArray = addNumber(arr, 5);
//        addSearch(arr,5,num);
//        search(arr,5,num);
//        rotateArray(arr,5,num);
//        bubbleSort(arr,5);
//        selectionSort(arr, 5);
//        majorityElement(arr,10);
//        localMinima(arr,10);

//        prime(2,num);
        printArray(arr, size);


    }
}
