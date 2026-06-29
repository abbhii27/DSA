public class CheckIfArrayisSort {
    public static void main(String[] args) {
        int[] arr= {1,4,3,6,7,2,5};
        boolean isSorted=true;
        int curr= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                isSorted=false;
                break;
            }

            if(isSorted=true){
                System.out.println("sorted");
            }else{
                System.out.println("not sorted");
            }
        }
    }
}
