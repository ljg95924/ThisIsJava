package thisIsJavaChapter12.ThreadGroupInterrupted;

public class WorkThread extends Thread {
    public WorkThread(ThreadGroup threadGroup, String ThreadName) {
        super(threadGroup, ThreadName);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
                break;
            }
        }
        System.out.println(getName() + "종료됨");
    }
}
