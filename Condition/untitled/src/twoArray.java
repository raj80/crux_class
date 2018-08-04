import java.util.Scanner;

public class twoArray {

  public class Oops {

    static class Animal{

      private int legs;
      private int ears;
      private int nose;
      private int eyes;

      public int getLegs() {
        return legs;
      }

      public void setLegs(int legs) {
        this.legs = legs;
      }

      public int getEars() {
        return ears;
      }

      public void setEars(int ears) {
        this.ears = ears;
      }

      public int getNose() {
        return nose;
      }

      public void setNose(int nose) {
        this.nose = nose;
      }

      public int getEyes() {
        return eyes;
      }

      public void setEyes(int eyes) {
        this.eyes = eyes;
      }
    }




    static void main (String args[]){

      Animal cow = new Animal();
      Scanner scn = new Scanner(System.in);
      System.out.println("enter legs");
      int l = scn.nextInt();

      cow.setLegs(l);

      System.out.println(cow.getLegs());

    }





  }


}
