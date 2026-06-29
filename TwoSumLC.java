package Java;
class TwoSumLC {
public static void main(String args[]){
    public int[] twoSum(int[] nums, int target) {   
       Hashmap<integer, integer> map= new Hasmap<>();
       for(int i=0;i<nums.length;i++){
        int desire = target-nums[i];
        if(map.conatins(desire)){
            return new int[]{map.get(desire), i}; 
        }
        map.put(nums[i], i);
       }
       return new int[]{};
    }
}

class Solution {
    public boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
       int sum= 0;
       while(x>0){
        int digit = x%10;
        sum = digit+ sum*10;
        x = x/10;
       } 
       return x == sum || x == sum / 10;;
    }
    }


    class Solution1{
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        // Reverse only half of the number
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }
    }
