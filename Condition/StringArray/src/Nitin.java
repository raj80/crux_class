import java.util.Scanner;

public class Nitin {

  public static void main(String[] args) {


    Scanner scn = new Scanner(System.in);
    System.out.println("Enter your string");
    String str = scn.nextLine();
    System.out.println("enter value of A: ");

    int start = scn.nextInt();
    System.ou-*99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    +3// t.println("enter Value of B: ");
    int end = scn.nextInt();

    char[] charArray = str.toCharArray();
    char[] charSecondArray = new char[end - start + 1];
    int j = 0;

    for ( int  i = start;  i <= end; i++){

      charSecondArray[j] = charArray[i];
      j++;

    }
//    for (int i = 0 ; i<charArray.length; i++){
//
//      if(charArray[i] == 'i'){
//        charSecondArray[j] = 'e';
//        j++;
//        charSecondArray[j]='e';
//        j++;
//      }
//      else {
//        charSecondArray[j] = charArray[i];
//        j++;
//      }
//    }
    System.out.println(charSecondArray);

  }


}


