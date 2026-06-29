package Java;
public class Calculator {
    
    public static void main(String a[]){
        AdvCal obj = new AdvCal();
        int r1 =obj.sum(10,15);
        int r2= obj.sub(10,15);

        System.out.println(r1+r2);
    }
}
