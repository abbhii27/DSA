
import java.util.Scanner;


// Sum of numbers from 1 to n:
// n * (n + 1) / 2
// Missing number:
// expected sum - actual sum

public class MissingNum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the no for n = " +n);
        int sum=0;
        int actualsum=n*(n+1)/2;
        for(int i=0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        int MissingNumis= actualsum-sum;
        
    }
}
