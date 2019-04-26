package evgenyt.comp_math_demo;

import evgenyt.comp_math.CompMath;
import evgenyt.comp_math.CompResult;

import java.util.Scanner;

/**
 * Computational Mathematics demo
 * Apr 2019 Evgeny Tyurin
 */

public class CompMathDemo {
    /** Run point */
    public static void main(String[] args) {
        System.out.println("1 - Secant method");
        System.out.println("2 - Newton's method");
        System.out.println("q - Quit");
        Scanner scanner = new Scanner(System.in);
        do {
            String userInput = scanner.next();
            CompResult compResult;
            switch (userInput) {
                case "1":
                    compResult = CompMath.secantMethod(CompMathDemo::testFunc, -1.1, 1,
                            0.00001, 1000000, false);
                    System.out.println("Result: " + compResult);
                    break;
                case "2":
                    compResult = CompMath.sirNewtonsMethod(CompMathDemo::testFunc,
                            CompMathDemo::testFuncDerivative, -1.1,
                            0.00001, 1000000, false);
                    System.out.println("Result: " + compResult);
                    break;
                case "q": return;
            }
        } while (true);
    }

    /** Function where we want to find root
     * @param x Function arguments
     * */
    private static Double[] testFunc(Double[] x) {
        // Edit that as you wish, but don't forget edit derivative
        return new Double[]{-1 * Math.pow(x[0] - 10, 2) + 5};
    }

    /** Derivative of function where we want to find root
     * @param x Function arguments
     * */
    private static Double[] testFuncDerivative(Double[] x) {
        // Edit this according to testFunc
        return new Double[]{-2 * Math.pow(x[0] - 10, 1)};
    }
}
