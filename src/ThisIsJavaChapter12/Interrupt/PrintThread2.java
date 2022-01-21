package ThisIsJavaChapter12.Interrupt;

public class PrintThread2 extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("실행중");
                Thread.sleep(100); //방법1
//                if (Thread.interrupted()) { //방법2
//                    break;
//                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("자원정리");
        System.out.println("실행종료");
    }
}
