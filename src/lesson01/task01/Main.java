package lesson01.task01;

public class Main {

    public static void main(String[] args) {

        // Два способа создания потоков:
        // 1. Наследование от класса Thread
        // 2. Реализация интерфейса Runnable

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

//        myThread1.run();
//        myThread2.run();

        // При первом способе мы просто вызываем метод start у нашего объекта
        myThread1.start();

        // При втором способе мы сначала создаём объект класса Thread,
        // передавая ему в конструктор наш объект, а потом вызываем
        // метод start у объекта Thread (а не у нашего объекта)
        Thread thread = new Thread(myThread2);
        thread.setDaemon(true);
        thread.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }













}
