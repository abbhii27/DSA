package Java;

import java.util.Scanner;

public class Nsum {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int n = 5;
        int sum =0;
        for (int i =0; i < n; i++) {
            sum = sum +i;
        }
        System.out.println(sum);
    }
}
