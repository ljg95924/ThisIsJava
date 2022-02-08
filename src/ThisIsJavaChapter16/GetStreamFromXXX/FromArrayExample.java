package ThisIsJavaChapter16.GetStreamFromXXX;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
    public static void main(String[] args) {
        String[] strArray = {"멍멍이", "야옹이", "징징이"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(a -> System.out.print(a + ","));
        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(i -> System.out.print(i + ","));
    }
}
