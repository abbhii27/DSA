package Java;

import java.util.Scanner;

public class SearchRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] arr= {0,1,13,16,-1,-4,19,27,58};
        int target=1123;
        int start= sc.nextInt();
        int end=sc.nextInt();
        int ans= search(arr,target,start,end);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end){

        if(arr.length==0){
            return-1;
        }
        for(int i=start; i<= end; i++){
            int element= arr[i];
            if(element ==target){
                return i;
            }
        }

        //not found in range
        return Integer.MAX_VALUE;
    }
}
