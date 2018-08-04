import java.util.ArrayList;
import java.util.Scanner;

public class Hashing {
//    public static void main(String[] args) {
//        String str = "thisismynamenitin";
//
//        int[] arr = new int[26];
//        for (int i = 0; i < 26; i++) {
//            arr[i] = 0;
//        }
//        char[] charArray = str.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            arr[charArray[i] - 97]++;
//        }
//        for (int i = 0; i < 26; i++) {
//            if (arr[i] > 0) {
//                System.out.println((char) (97 + i) + " occurs " + arr[i] + " times");
//            }
//        }
//    }
public static void main(String[] args){
    Scanner scanner=new Scanner (System.in);
    ArrayList<Integer> arraylist = new ArrayList<>();
    System.out.println("enter the size of array");
    int size = scanner.nextInt();
    System.out.println("how much times u want to shift the number  ");
    int plz=scanner.nextInt();
    //plz stands for how much times u want to rotate the number


    for(int i=0;i<size;i++){
        int num= scanner.nextInt();
        arraylist.add(num);
// and here num stands to attain input from the user
    }
//    for(int i=0 ; i<size/2; i++){
//        int tmp=arraylist.get(i);
//        arraylist.set(i,arraylist.get(size-i-1));
//        arraylist.set(size-i-1,tmp);
        for (int j=0;j<plz;j++){
        for(int i=0; i<size-1; i++){
            int tmp=arraylist.get(i);
            arraylist.set(i,arraylist.get(i+1));
            arraylist.set(i+1,tmp);
        }
}
for (int i=0; i<size; i++){
    System.out.println(arraylist.get(i));
}
    }
//    for (int i=0; i<size;i++){
//        System.out.println(arraylist.get(i));
//    }
//}





}
