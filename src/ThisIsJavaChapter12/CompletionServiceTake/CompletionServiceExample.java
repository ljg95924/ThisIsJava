package thisIsJavaChapter12.CompletionServiceTake;

import java.util.concurrent.*;

public class CompletionServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);

        System.out.println("작업처리요청");
        for (int i = 0; i < 3; i++) {
            completionService.submit(new Callable<Integer>() { //스레드풀에게 작업처리요청
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for (int i = 1; i <= 10; i++) {
                        sum += i;
                    }
                    return sum;
                }
            });
        }
        System.out.println("처리완료된 작업확인");
        executorService.submit(new Runnable() { //스레드풀의 스레드에서 실행하도록함
            @Override
            public void run() {
                while (true) {
                    try {
                        Future<Integer> future = completionService.take(); //완료된 작업가져오기
                        int value = future.get();
                        System.out.println("처리결과 " + value);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        });
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        executorService.shutdownNow();
    }
}
