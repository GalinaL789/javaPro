package homework01.homework1_Thread_Runnable;

class Thread2 implements Runnable{
    public static String numbertoString;
@Override
    public void run() {
       // count = 0; // Используем статическую переменну
        for (int i = 1_000_000_001; i <= 2_000_000_000; i++) {
            numbertoString = Integer.toString(i);

            if (i % 21 == 0 && numbertoString.contains("3")) {
                Main.incrementCount();
                System.out.println(i + " " + Main.getCount() + " " + Thread.currentThread().getName());
            }
        }
    }
}