import java.util.Scanner;

public class Stringtest {
       public static void main (String [] args) {
           Scanner scn = new Scanner(System.in);
           System.out.println("enter ur string  ");
           String str = scn.nextLine();
           System.out.println("enter number a");
           int a = scn.nextInt();
           System.out.println("enter number b");
           int b = scn.nextInt();
           char[] charArray = str.toCharArray();
           char[] charsecondArray = new char[b-a + 1];
//           int j = 0;
//           for (int i = a; i <= b; i++) {
//               charsecondArray[i] = charArray[j];
//               j++;
//           }
           for (int i=a; i<=b; i++){
               charsecondArray[i-a]=charArray[i];

           }
           System.out.println(charsecondArray);
       }
//            if (charArray[i]=charArray[i]{
////                charArray[i]='o';
//                charsecondArray[j]='e';
//                j++;
//                charsecondArray[j]='e';
//                j++;
//            }
//            else {
//                charsecondArray[j]= charArray[i];
//                j++;
//            }
//        }
//        System.out.println(charsecondArray);
//    }
}
