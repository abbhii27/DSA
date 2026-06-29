import java.util.Scanner;

/*
    *    
   ***   
  *****  
 ******* 
********* 
*/

public class PatternQue7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=0; row<n; row++){

            //for space 
            for(int col=0; col<n-row-1;col++){
                System.out.print(" ");
            }
            //for star
            for(int col=0;col<2*row+1;col++){
                System.out.print("*");
            }
            //for space 
            for(int col=0; col<n-row-1;col++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
