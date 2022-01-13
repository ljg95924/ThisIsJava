package ThisIsJavaChapter08;

public class Bus implements Vehicle{

    @Override
    public void run() {
        System.out.println("Bus 출발~");
    }

    public void checkFare(){
        System.out.println("승차요금을 체크합니다.");
    }
}
