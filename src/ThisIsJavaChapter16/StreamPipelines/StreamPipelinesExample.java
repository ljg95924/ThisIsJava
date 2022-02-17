package thisIsJavaChapter16.streamPipelines;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("멍멍이", Member.Male, 30),
                new Member("야옹이", Member.Female, 20),
                new Member("징징이", Member.Male, 45),
                new Member("송송이", Member.Female, 27)
        );

        double ageAvg = list.stream()
                .filter(m -> m.getSex() == Member.Male)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();

        System.out.println("남자평균나이: " + ageAvg);
    }
}
