package ThisIsJavaChapter16.FilteringMethod;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("아이스크림", "과자", "젤리", "껌", "아이스", "아이스");
        names.stream()
                .distinct() //중복제거
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .filter(n -> n.startsWith("아")) //필터링
                .forEach(n -> System.out.println(n));
        System.out.println();

        //중복제거후 필터링
        names.stream()
                .distinct()
                .filter(n -> n.startsWith("아"))
                .forEach(n -> System.out.println(n));
    }
}
