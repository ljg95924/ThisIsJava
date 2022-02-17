package thisIsJavaChapter14.predicateInterface;

public class Student {

    private String name;
    private String sex;
    private int score;

    public Student(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getSex() {
        return sex;
    }
}
