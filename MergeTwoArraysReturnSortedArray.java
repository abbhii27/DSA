package AdvanceArray;

public class MergeTwoArraysReturnSortedArray {

    public int[] mergetwoarrays(int[] a, int[] b){

        int[] res = new int[a.length + b.length];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while(p1 < a.length && p2 < b.length){

            if(b[p2] <= a[p1]){
                res[p3] = b[p2];
                p2++;
                p3++;
            }
            else{
                res[p3] = a[p1];
                p3++;
                p1++;
            }
        }

        while(p2 < b.length){
            res[p3] = b[p2];
            p2++;
            p3++;
        }

        while(p1 < a.length){
            res[p3] = b[p1];
            p1++;
            p3++;
        }

        return res;
    }
}
