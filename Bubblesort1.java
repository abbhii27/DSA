package Collection;

public class Bubblesort1 {
    public static void main(String[] args) {
        int arr[] = {6,5,2,8,9,4};

        int size= arr.length;
        System.out.println("Before sorting:");
        for(int num: arr){
            System.out.print(num + " ");
        }
        // Bubble Sort Algorithm
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(arr[j]> arr[j+1]){
                    // swap arr[j] and arr[j+1]
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println();
            for(int num1:arr){
                System.out.print(num1 );
            }
        }

        System.out.println("\nAfter sorting:");
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
