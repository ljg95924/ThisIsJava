package thisIsJavaChapter07;

public class OverridingExample {
    public static void main(String[] args) {
        int r = 10;

        OverridingCalculator Calculator = new OverridingCalculator();
        System.out.println(Calculator.areaCircle(r));

        OverridingComputer computer = new OverridingComputer();
        System.out.println(computer.areaCircle(r));

        int SuperR = 6000;
        System.out.println(computer.areaCircle(SuperR));
    }
}
