package ThisIsJavaChapter12.ObjectMethodWaitNotifyNotifyAll;

public class WorkObject {
    public synchronized void methodA() {
        System.out.println("ThreadA의 MethodA() 작업실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }

    public synchronized void methodB() {
        System.out.println("ThreadB의 MethodB() 작업실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }
}
