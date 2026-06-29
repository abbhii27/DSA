class Mythread implements  Runnable {
   
    public void run(){
        System.out.println("Thread is running");
    }
}

public class ThreadusingRunnable {
    public static void main(String[] args) {
        Mythread t1= new Mythread();
        
        // Mythread t2= new Mythread();
       
         // Pass the runnable reference to Thread
        Thread t3 = new Thread( (Runnable) t1, "t1");

        // Thread t4 = new Thread( t2 , "t2");
        t3.start();

    }
}
