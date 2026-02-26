package AdvanceArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubarraySumEqualsTargetSlidingWin {

    public List<Integer> subarray(int[] arr, int target){

        int l = 0;
        int r = 1;
        int sum = 0;
        sum = arr[l] + arr[r];
        List<Integer> res = new ArrayList<>();

        for (int j : arr) {
            if (j == target) {
                return Collections.singletonList(1);
            }
        }

        while(r < arr.length){
            if(sum < target){
                r++;
                sum+= arr[r];
            }
            if(sum > target){
                sum-= arr[l];
                l++;
            }
            if(sum == target){
                for(int i = l ; i <= r ; i++){
                    res.add(arr[i]);
                }
                return res;
            }
        }
        return Collections.emptyList();
    }
}
