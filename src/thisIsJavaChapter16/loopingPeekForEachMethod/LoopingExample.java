package thisIsJavaChapter16.loopingPeekForEachMethod;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        System.out.println("peek()를 마지막에 호출할 경우");
        Arrays.stream(intArray)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n));

        System.out.println("최종 처리 메소드를 마지막에 호출한 경우");
        int total = Arrays.stream(intArray)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.print(n + ","))
                .sum();
        System.out.println();

        System.out.println("forEach()를 마지막에 호출");
        Arrays.stream(intArray)
                .filter(a -> a % 2 == 0)
                .forEach(n -> System.out.print(n + ","));
    }
}
