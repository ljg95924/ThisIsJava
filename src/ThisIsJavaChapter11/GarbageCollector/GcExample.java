package ThisIsJavaChapter11.GarbageCollector;

public class GcExample {
    public static void main(String[] args) {
        Employee emp;

        emp = new Employee(1); //쓰레기
        emp = null;
        emp = new Employee(2); //쓰레기
        emp = new Employee(3);

        System.out.println("최종적으로 참조하는 사원번호: " + emp.eno);
        System.gc();
    }
}

class Employee {
    int eno;

    public Employee(int eno) {
        this.eno = eno;
        System.out.println("Employee(" + eno + ") 이 메모리에 생성됨");
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Employee(" + eno + ") 이 메모리에서 제거됨");
    }

}