package thisIsJavaChapter11.finalize;

public class FinalizeExample {
    public static void main(String[] args) {
        Counter counter = null;

        for(int i=1; i<=500; i++){
            counter = new Counter(i);
            
            //counter 객체를 쓰레기로 만듬
            counter = null;
            //쓰레기 수집기 실행 요청
            System.gc();
        }

    }
}
