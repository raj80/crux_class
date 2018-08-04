public class Pallendrom {
    public static void main (String args[]){
        int num=121;
        int rev=0;
        int input=num;
        int remainder=0;
        while (num>0){
            remainder = num%10;
            rev =rev*10 + remainder;
            num=num/10;
        }
        if (rev==input){
            System.out.println("yes number is pallendrom");
        }else
        System.out.println("no the number is not pallendrom");
    }
}
