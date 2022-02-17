package thisIsJavaChapter14.predicateAndOrNegate;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {
        IntPredicate predicateA = a -> a % 2 == 0;
        IntPredicate predicateB = a -> a % 3 == 0;

        IntPredicate predicateAB;
        boolean result;

        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수인가? " + result);

        predicateAB = predicateA.or(predicateB);
        System.out.println("9는 2또는 3의 배수인가? " + predicateAB.test(9));

        predicateAB = predicateA.negate();
        System.out.println("9는 홀수인가? " + predicateAB.test(9));
    }
}
