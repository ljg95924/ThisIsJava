package thisIsJavaChapter16.sequenceAndParallelCompare;

import java.util.Arrays;
import java.util.List;

public class SequentialVsParallelExample {
    // 요소 처리
    public static void work(int value) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }

    // 순차 처리
    public static long testSequential(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().forEach((a) -> work(a));
        long end = System.nanoTime();
        return end - start;
    }

    // 병렬 처리
    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().parallel().forEach(a -> work(a));
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        // 소스 컬렉션
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        // 처리 시간
        long timeSequential = testSequential(list);
        long timeParallel = testParallel(list);

        System.out.println("timeSequential: " + timeSequential);
        System.out.println("timeParallel: " + timeParallel);
    }
}
