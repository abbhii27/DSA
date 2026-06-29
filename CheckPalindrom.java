
import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        String rev = new StringBuilder(str).reverse().toString();
        if(rev.equals(str)){
            System.out.println("string is palindrom");
        }else{
            System.out.println("string is not palindrom");
        }
        sc.close();
    }
}
