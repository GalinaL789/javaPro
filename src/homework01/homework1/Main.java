package homework01.homework1;

public class Main {
    private static int count = 0; // Переменная должна быть статической
    private static String numberString;

    public static void main(String[] args) {
        count = 0; // Используем статическую переменн
        for (int i = 1; i <= 2_000_000_000; i++) {
            numberString = Integer.toString(i);

            if (i % 21 == 0 && numberString.contains("3")) {
                count++;
                System.out.println(i + " " + count);
            }
        }
        System.out.println(Thread.currentThread().getName() + " " );
    }
}
