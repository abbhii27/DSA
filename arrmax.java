package Java;
public class arrmax {
    public static void main(String args[]){
        int[] arr={1,5,8,11,23};


    }

    static void max(int[] arr){
        int max= arr[0];
        for (int idx = 0; idx < arr.length; idx++) {
            if(max<arr[idx]){
                max= arr[idx];
                System.out.println("Max of array is" + max);
            }    
            
        }
}
}
