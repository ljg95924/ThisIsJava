package thisIsJavaChapter16.parallelStream;

import thisIsJavaChapter16.collectMethod.Student;
import thisIsJavaChapter16.userContainer.MaleStudent;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("비트", 10, Student.Sex.MALE),
                new Student("리플", 10, Student.Sex.FEMALE),
                new Student("도지", 10, Student.Sex.MALE),
                new Student("이더", 10, Student.Sex.FEMALE)
        );
        MaleStudent maleStudent = totalList.parallelStream()
                .filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);

        maleStudent.getList().stream()
                .forEach(s->System.out.println(s.getName()));
    }
}
