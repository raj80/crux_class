import java.security.Principal;

public class Compound {
    public static void main(String args[]) {
        int Principle = 1000;
        int Rate = 2;
        int Time = 5;
        int i = 1;
        int container = 1;
        //(1+RAte)*Time
        //(1+2)^5
        //(1+2)*(1+2)*(1+2)*(1+2)*(1+2)*(1+2)*
        while (i <= Time) {
            container = container * (1 + Rate);
            i = i + 1;
        }
        container=container*Principle;
        System.out.println(container);
    }
}
