
import java.util.HashSet;
import java.util.Set;

public class CommonElemBwArrays {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,3};
        int[] b= {4,5,6,7,8,3};
        Set<Integer> set= new HashSet<>();
        for(int num: a){
            set.add(num);
        }
        for(int num:b){
            if(set.contains(num)){
                System.out.println(num);
            }
            
        }
    }
}
