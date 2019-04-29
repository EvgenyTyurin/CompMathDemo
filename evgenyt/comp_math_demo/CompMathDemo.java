package evgenyt.comp_math_demo;

import evgenyt.comp_math.CompResult;
import evgenyt.comp_math.comp_method.CompMethod;
import evgenyt.comp_math.comp_method.NewtonsMethod;
import evgenyt.comp_math.comp_method.SecantMethod;
import evgenyt.comp_math.function.Function;
import evgenyt.comp_math.function.QuadraticFunction;

import java.util.Scanner;

/**
 * Computational Mathematics demo
 * Apr 2019 Evgeny Tyurin
 */

public class CompMathDemo {
    /** Run point */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*** Select computation method");
            System.out.println("1 - Secant method");
            System.out.println("2 - Newton's method");
            System.out.println("q - Quit");
            String userInput = scanner.next();
            CompResult compResult;
            Function function = new QuadraticFunction();
            CompMethod compMethod = null;
            switch (userInput) {
                case "1":
                    compMethod = new SecantMethod();
                    break;
                case "2":
                    compMethod = new NewtonsMethod();
                    break;
                case "q": return;
            }
            if (compMethod != null) {
                compResult = compMethod.calculate(function);
                System.out.println("Result: " + compResult);
            }
        } while (true);
    }

}
