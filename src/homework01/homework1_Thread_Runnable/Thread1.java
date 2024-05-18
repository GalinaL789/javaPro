package homework01.homework1_Thread_Runnable;

class Thread1 extends Thread {
    public static String numbertoString;

    public void run() {
        for (int i = 1; i <= 1_000; i++) {
            numbertoString = Integer.toString(i);

            if (i % 21 == 0 && numbertoString.contains("3")) {
                Main.incrementCount();
                System.out.println(i + " " + Main.getCount() + " " + Thread.currentThread().getName());
            }
        }
    }
}