package thisIsJavaChapter16.mapAndReduceExample;

import thisIsJavaChapter16.lambdaExpressionsForeach.Student;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> stduentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("갑을병", 20),
                new Student("나란히", 30)
        );

        double avg = stduentList.stream().
                //중간처리(학생 객체를 점수로 매핑)
                        mapToInt(Student::getScore)
                //최종처리(평균점수)
                .average()
                .getAsDouble();

        System.out.println("평균점수: " + avg);
    }
}
