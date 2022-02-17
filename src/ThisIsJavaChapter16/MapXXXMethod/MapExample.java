package thisIsJavaChapter16.mapXXXMethod;

import thisIsJavaChapter16.lambdaExpressionsForeach.Student;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("나윤권", 10),
                new Student("김진표", 20),
                new Student("강민경", 30)
        );

        studentList.stream()
                .mapToInt(Student::getScore)
                .forEach(score -> System.out.println(score));
    }
}
