import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int val1=66;
        int val2=293798;
        int small=whoissmaller(val1, val2);
        System.out.println(small);


    }
    public static int whoissmaller (int val1, int val2){

        if (val1<val2)
            return val1;
        else
            return val2;
    }
}
