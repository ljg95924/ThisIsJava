package ThisIsJavaChapter07;

public class OverridingComputer extends OverridingCalculator {
    @Override
    double areaCircle(double r) {
        if(r<5000){
            System.out.println("Computer객체의 메소드 실행");
            return Math.PI * r * r;
        }
        else{
            System.out.println("부모객체의 메소드 강제실행");
            return super.areaCircle(r);
        }
    }

}
