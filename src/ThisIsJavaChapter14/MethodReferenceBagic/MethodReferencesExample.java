package ThisIsJavaChapter14.MethodReferenceBagic;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("정적메소드 결과: " + operator.applyAsInt(3, 4));

        operator = Calculator::staticMethod;
        System.out.println("정적메소드 메소드참조 결과: " + operator.applyAsInt(3, 4));

        Calculator calculator = new Calculator();
        operator = (x, y) -> calculator.instanceMethod(x, y);
        System.out.println("인스턴스 메소드 결과: " + operator.applyAsInt(3, 4));

        operator = calculator::instanceMethod;
        System.out.println("인스턴스 메소드참조 결과: " + operator.applyAsInt(3, 4));
    }
}
