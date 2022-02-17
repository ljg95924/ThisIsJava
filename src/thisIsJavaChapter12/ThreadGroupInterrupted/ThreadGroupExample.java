package thisIsJavaChapter12.ThreadGroupInterrupted;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(threadGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(threadGroup, "workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("main 스레드 그룹의 list() 메소드 출력 내용");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        System.out.println("myGroup 스레드 스룹의 interrupt() 메소드 호출");
        threadGroup.interrupt();
    }
}
