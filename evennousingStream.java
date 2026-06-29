package Java;

import java.text.CompactNumberFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class evennousingStream {
    public static void main(String[] args) {
        
    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> even= numbers.stream().filter(n->n%2==0).collect(Collector.);
    System.out.println(even);

    //get the maximum no of arraylist
    numbers.stream().max(Integer::compare).orElseThrow();

    //sorted a list in resverse order
    @SuppressWarnings("unused")
    List<Integer> reverse= numbers.stream().sorted(Comparator.reverseOrder()).collect(Collector.toList());

    }
}
