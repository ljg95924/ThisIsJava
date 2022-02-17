package thisIsJavaChapter16.collectMethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("성시경", 10, Student.Sex.MALE),
                new Student("아이유", 6, Student.Sex.FEMALE),
                new Student("박효신", 10, Student.Sex.MALE),
                new Student("고윤하", 6, Student.Sex.FEMALE)
        );

        //남학생들만 묶어 List 생성
        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(Collectors.toList());

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));
        System.out.println();

        //여학생들만 묶어 HashSet 생성
        Set<Student> femaleSet = totalList.stream()
                .filter(s -> s.getSex() == Student.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new)); //클래스 :: new (객체생성)

        femaleSet.stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
