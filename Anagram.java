import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1= sc.next();
        String str2= sc.next();
        char[] a= str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)){
            System.out.println("Anagram");
        } else{
            System.out.println("Not Anaggram");
        }
        sc.close();
    }      
}
