package thisIsJavaChapter12.YieldExample;

public class ThreadA extends Thread {
    public boolean work = true;
    public boolean stop = false;

    @Override
    public void run() {
        while (!stop) {
            if (work) {
                System.out.println("ThreadA 작업 내용");
            } else {
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료");
    }
}
