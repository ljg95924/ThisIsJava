package ThisIsJavaChapter14.FunctionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
    private List<Student> list = Arrays.asList(
            new Student("홍길동", 90, 96),
            new Student("엄친아", 100, 100)
    );

    public double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for (Student student : list) {
            sum += function.applyAsInt(student);
        }
        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        FunctionExample2 functionExample2 = new FunctionExample2();
        double englishAvg = functionExample2.avg(s -> s.getEnglishScore());
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = functionExample2.avg(s -> s.getMathScore());
        System.out.println("수학 평균 점수: " + mathAvg);
    }
}
