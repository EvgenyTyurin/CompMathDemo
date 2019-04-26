package evgenyt.comp_math_demo;

import evgenyt.comp_math.CompMath;
import evgenyt.comp_math.CompResult;

/**
 * Computational Mathematics demo
 * Apr 2019 Evgeny Tyurin
 */

public class CompMathDemo {

    private static double testFunc(double x) {
        return Math.pow(x, 3) + x - 10;
    }

    public static void main(String[] args) {
        CompResult compResult = CompMath.secantMethod(CompMathDemo::testFunc, -1.1, 1, 0.00001,
                1000000, false);
        System.out.println("Result: " + compResult);
    }
}
