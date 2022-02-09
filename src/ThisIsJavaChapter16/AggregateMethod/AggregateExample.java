package ThisIsJavaChapter16.AggregateMethod;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        long count = Arrays.stream(intArray)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("2의 배수 개수: " + count);

        long sum = Arrays.stream(intArray)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("2의 배수 합: " + sum);

        double avg = Arrays.stream(intArray)
                .filter(n -> n % 2 == 0)
                .average()
                .getAsDouble();
        System.out.println("2의 배수 평균: " + avg);

        int max = Arrays.stream(intArray)
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
        System.out.println("최대값: " + max);

        int first = Arrays.stream(intArray)
                .filter(n -> n % 2 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("첫번째 2의 배수: " + first);


    }
}
