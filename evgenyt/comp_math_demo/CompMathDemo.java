package evgenyt.comp_math_demo;

import evgenyt.comp_math.UserInt;
import evgenyt.comp_math.comp_method.CompMethod;
import evgenyt.comp_math.function.Function;

/**
 * Computational Mathematics demo
 * Apr 2019 Evgeny Tyurin
 */

public class CompMathDemo {
    /** Run point */
    public static void main(String[] args) {
        Function function = UserInt.askFunction();
        if (function == null)
            return;
        UserInt.message("Function: " + function.toString());
        do {
            CompMethod compMethod = UserInt.askMethod();
            if (compMethod != null)
                calculate(function, compMethod);
            else
                break;
        } while (true);
    }


    private static void calculate(Function function, CompMethod compMethod){
        UserInt.message("Result: " + compMethod.calculate(function));
    }

}
