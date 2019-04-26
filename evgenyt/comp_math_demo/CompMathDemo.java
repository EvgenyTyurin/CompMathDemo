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
     * @param x Function argument
     * */
    private static double testFunc(double x) {
        // Edit that as you wish, but don't forget edit derivative
        return Math.pow(x, 3) + x + 10 ;
    }

    /** Derivative of function where we want to find root
     * @param x Function argument
     * */
    private static double testFuncDerivative(double x) {
        // Edit this according to testFunc
        return Math.pow(x, 2) * 3 + 1;
    }
}
