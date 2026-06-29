package Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class collection1 {
    
    public static void main(String[] args) {
        
    
    @SuppressWarnings("Convert2Diamond")
    Collection<Integer> nums = new TreeSet<Integer>();
    nums.add(10);
    nums.add(20);
    nums.add(30);
    nums.add(40);


    Iterator<Integer> value= nums.iterator();

    while(value.hasNext()){
        System.out.println(value.next());
    }





    }
}
