package ThisIsJavaChapter16.GetStreamFromXXX;

import ThisIsJavaChapter16.LambdaExpressionsForeach.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("멍멍이", 10),
                new Student("야옹이", 20),
                new Student("징징이", 30)
        );
        Stream<Student> stream = studentList.stream();
        stream.forEach(s -> System.out.println(s.getName()));
    }
}
