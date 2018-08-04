public class Stringcount {
    public static void main (String[]args){
        String str="thisismynamenitin";
        int count=0;
        char[]chararray=str.toCharArray();
        for(int i=0;i<chararray.length; i++){
            if(chararray[i]=='n'){
                count++;
            }
        }
        System.out.println(count);

    }
}
