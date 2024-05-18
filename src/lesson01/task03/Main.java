package lesson01.task03;

public class Main {

    private static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        for (int i = 0; i < 1_000_000; i++) {
            increment();
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

        // 1. Дан диапазон чисел: от 1 до 2_000_000_000 включительно.
        // 2. Задача: при помощи цикла найти, сколько чисел из этого диапазона
        //    делятся нацело на 21 и при этом содержат цифру 3.
        // 3. Решить задачу в один поток.
        // 4. Решить задачу в два потока, разделив данный диапазон поровну между потоками.
        // 5. Сравнить результаты. Результат должен быть одинаковым.
    }
}
