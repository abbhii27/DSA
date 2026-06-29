package Collection;

public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int target =11;

        int result1= linearsearch(arr, target);
        int result2 = BinarySearch(arr, target);

        if(result2 != -1 ){
            System.out.println("Element found at index: "+ result2);
        } else{
            System.out.println("Element not found in the array.");
        }
         if(result1 != -1 ){
            System.out.println("Element found at index: "+ result1);
        } else{
            System.out.println("Element not found in the array.");
        }

    }


    public static int linearsearch(int [] arr, int target) {
        // TODO Auto-generated method stub
        int steps=0;
        for(int i=0;i<arr.length;i++){
            steps++;
            if(arr[i]==target){
                System.out.println("Steps taken: "+ steps);
                return i;
            }
        } 
        System.out.println("Steps taken: "+ steps);
        return -1;
    }


    public static int BinarySearch(int [] arr, int target){
        int left=0;
        int steps=0;
        int right=arr.length-1;
        while(left<=right){
            int mid= (left+right)/2;
            steps++;
            if(arr[mid]== target){
                System.out.println("Steps taken: "+ steps);
                return mid;
            } else if(arr[mid] < target){
                left=mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
   
}    