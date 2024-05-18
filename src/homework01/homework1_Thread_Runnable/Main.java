package homework01.homework1_Thread_Runnable;

public class Main {
    private static int count=0;
    public static synchronized void incrementCount(){
        count++;
    }
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The number of counts: " + count);
    }

    public static int getCount() {
        return count;
    }


}