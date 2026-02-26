package AdvanceArray;

public class ThirdLargestElement {


    public int thirdMax(int[] arr){
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int third_max = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > first_max){
                third_max = second_max;
                second_max = first_max;
                first_max= arr[i];
            }

            else if(arr[i] > second_max){
                third_max = second_max;
                second_max = arr[i];
            }
            else if(arr[i] > third_max){
                third_max = arr[i];
            }
        }

        if(third_max == Integer.MIN_VALUE){
            return -1;
        }
        return third_max;

    }


}
