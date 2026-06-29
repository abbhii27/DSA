
public class LargestAnd2ndLargest {
    
    public static void main(String[] args) {
    int[] arr = {10,50,30,80,20};
    int largest = Integer.MAX_VALUE;
    int secndLargest= Integer.MIN_VALUE;
    for(int num: arr) {
        if(num>largest){
            secndLargest=largest;
            largest=num;
        }
        else if(num>secndLargest && num!=largest){
            secndLargest = num;
        }
    }
    System.out.println("Largest"+ largest);
    System.out.println("secndlarget"+ secndLargest);

    }

}
