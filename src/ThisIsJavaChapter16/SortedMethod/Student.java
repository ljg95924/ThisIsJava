package ThisIsJavaChapter16.SortedMethod;

public class Student implements Comparable<Student> {

    private String grade;
    private int score;

    public Student(String grade, int score) {

        this.grade = grade;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }
}
