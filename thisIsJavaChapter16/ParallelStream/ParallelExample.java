package thisIsJavaChapter16.parallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("아이유", "고윤하", "성시경", "에픽하이", "하하");

        //순차처리
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample::print); //s -> ParallelExample.print(s) 와 같은표현

        System.out.println();

        //병렬처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);

    }

    public static void print(String str) {
        System.out.println(str + ": " + Thread.currentThread().getName());
    }
}
