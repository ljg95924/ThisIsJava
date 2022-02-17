package thisIsJavaChapter14.predicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private List<Student> list = Arrays.asList(
            new Student("타블로", "남자", 90),
            new Student("아이유", "여자", 90),
            new Student("성시경", "남자", 95),
            new Student("윤하", "여자", 92)
    );

    public double avg(Predicate<Student> predicate) {
        int count = 0, sum = 0;
        for (Student student : list) {
            if (predicate.test(student)) {
                count++;
                sum += student.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        PredicateExample predicateExample = new PredicateExample();
        double maleAvg = predicateExample.avg(t -> t.getSex().equals("남자"));
        System.out.println("남자 평균 점수: " + maleAvg);

        double femaleAvg = predicateExample.avg(t -> t.getSex().equals("여자"));
        System.out.println("여자 평균 점수: " + femaleAvg);
    }
}
