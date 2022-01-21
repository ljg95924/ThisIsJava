package ThisIsJavaChapter12.Interrupt;

import ThisIsJavaChapter12.StopFlag.PrintThread;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        thread.interrupt();
    }
}
