package thisIsJavaChapter16.collectMethod;

public class Student {
    private String name;
    private int score;
    private Sex sex;
    private City city;

    public enum Sex {MALE, FEMALE}

    public enum City {Seoul, Busan}

    public Student(String name, int score, Sex sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public Student(String name, int score, Sex sex, City city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Sex getSex() {
        return sex;
    }

    public City getCity() {
        return city;
    }
}
