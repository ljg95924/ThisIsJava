package ThisIsJavaChapter12.ThreadPoolExecute;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    //스레드 총 개수 및 작업 스레드 이름 출력
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("총 스레드 개수: " + poolSize + ", 작업 스레드 이름: " + threadName);
                    //예외 발생 시킴
                    int value = Integer.parseInt("삼");
                }
            };
            executorService.execute(runnable); //작업처리요청
            Thread.sleep(10);
        }
        executorService.shutdown(); //스레드풀 종료
    }
}
