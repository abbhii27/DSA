package Java;
public class linearsearch {
    
    public static void main(String[] args) {
        int[] arr= {0,1,13,16,-1,-4,19,27,58};
        int target = 27;
        int ans = linearsrch1(arr, target);
        System.out.println(ans);
    }

    static int linearsrch(int[] arr, int target) {
        if(arr.length==0){
            return -1;   }
        for (int element : arr) {
            if(element == target){
                return element;  }
        }

    
        //target not found exception means we did not find any target
        return Integer.MAX_VALUE;
    }

    static int linearsrch1(int[] arr, int target) {
        if(arr.length==0){
            return -1;   }
        for (int index=0;index<arr.length;index++) {
            if(arr[index] == target){
                return index;  }
        }

    
        //target not found exception means we did not find any target
        return -1;
    }
}
