package thisIsJavaChapter16.userContainer;


import thisIsJavaChapter16.collectMethod.Student;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍", 10, Student.Sex.MALE),
                new Student("김", 6, Student.Sex.FEMALE),
                new Student("양", 10, Student.Sex.MALE),
                new Student("금", 6, Student.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.stream()
                .filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);

        maleStudent.getList().stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
