package lesson01.task02;

public class Main {

    public static int counter = 0;

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        for (int i = 0; i < 1_000_000; i++) {
            counter++;
        }

        try {
            // Мы просим главный поток остановиться в этом месте и дождаться,
            // пока остальные потоки завершат свою работу
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Значение счётчика - " + counter);
    }
}
