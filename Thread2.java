class Mythhread extends Thread{

    int count=0;
    @Override
    public void run() {
            for(int i =0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+ " "+ count++);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
    }

}

public class Thread2 {
    public static void main(String[] args) {
        Mythhread t1 = new Mythhread();
        Mythhread t2 = new Mythhread();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();

    }
}