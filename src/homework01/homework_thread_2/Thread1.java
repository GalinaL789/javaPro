package homework01.homework_thread_2;

class Thread1 extends Thread {
    public static int count = 0; // Переменная должна быть статической
    public static String numbertoString;

    public void run() {
        count = 0; // Используем статическую переменну
        for (int i = 1; i <= 1_000; i++) {
            numbertoString = Integer.toString(i);

            if (i % 21 == 0 && numbertoString.contains("3")) {
                count++;
                System.out.println(i+ " " + count);
            }
        }
    }
}