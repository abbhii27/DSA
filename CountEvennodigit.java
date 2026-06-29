package Java;
public class CountEvennodigit {
    public static void main(String[] args) {
        int[] arr= {10,2,4,66,1794,666,7999};
        int ans = findDigit(arr);
        System.out.println(ans);
    }

    //first lets count the digits after we will find if digit is even or not how?... lets create a method which check digit is even or not
    static int findDigit(int[] arr){
        int count=0;
        for(int num: arr){
            if(even(num)){
                count ++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberofDigits = digit(num);
        // if(numberofDigits%2==0){
        //     return true;
        // }
        // return false;
        return numberofDigits % 2 == 0;
    }
    static int digit(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
}
