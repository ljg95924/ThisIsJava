package ThisIsJavaChapter13.WildcardType;

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        // 타입 파라미터로 배열을 생성하려면 new T[n]가 형태로 생성할수 없고 아래와같이 생성 해야함
        this.students = (T[]) (new Object[capacity]);
    }

    public T[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void add(T t) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }
}
