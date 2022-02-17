package thisIsJavaChapter16.sortedMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        //숫자 요소일 경우
        IntStream intStream = Arrays.stream(new int[]{5, 3, 6, 1, 2});
        intStream
                .sorted()
                .forEach(i -> System.out.print(i + ","));
        System.out.println();

        //객체 요소일 경우
        List<Student> studentList = Arrays.asList(
                new Student("고2", 10),
                new Student("고1", 15),
                new Student("고3", 30)
        );
        studentList.stream()
                .sorted()
                .forEach(s -> System.out.print(s.getScore() + ","));
        System.out.println();

        studentList.stream()
                .sorted(Comparator.reverseOrder()) //정수를 기준으로 내림차순으로 정렬
                .forEach(student -> System.out.print(student.getScore() + ","));


    }
}
