package thisIsJavaChapter11.compare;

import java.util.Objects;

public class CompareExample {
    public static void main(String[] args) {
        CompareExample compareExample = new CompareExample();
        Student s1 = compareExample.new Student(1);
        Student s2 = compareExample.new Student(1);
        Student s3 = compareExample.new Student(2);
        //Student s1 = new Student(1);
        //Student s2 = new Student(1);
        //Student s3 = new Student(2);

        int result = Objects.compare(s1, s2, new StudentComparator());
        System.out.println(result);

        result = Objects.compare(s1, s3, new StudentComparator());
        System.out.println(result);
    }

    public class Student {
        int sno;

        Student(int sno) {
            this.sno = sno;
        }
    }

}
