package evgenyt.comp_math_demo;

import evgenyt.comp_math.UserInt;
import evgenyt.comp_math.comp_methods.RootFindingMethod;
import evgenyt.comp_math.functions.Function;
import evgenyt.comp_math.functions.LinearSystem;

/**
 * Computational Mathematics demo
 * Apr 2019 Evgeny Tyurin
 */

public class CompMathDemo {
    /** Run point */
    public static void main(String[] args) {
        do {
            UserInt.message("1 - Root finding");
            UserInt.message("2 - Linear system solving");
            UserInt.message("q - Exit");
            String userInput = UserInt.getString("Select task:");
            switch (userInput) {
                case "1":
                    Function function = UserInt.askFunction();
                    if (function == null)
                        return;
                    UserInt.message("Function: " + function.toString());
                    do {
                        RootFindingMethod compMethod = UserInt.askMethod();
                        if (compMethod != null)
                            calculate(function, compMethod);
                        else
                            break;
                    } while (true);
                    break;
                case "2":
                    LinearSystem linearSystem = new LinearSystem();
                    UserInt.message(linearSystem.toString());
                    break;
                case "q":
                    return;
            }
        } while (true);
    }

    private static void calculate(Function function, RootFindingMethod compMethod){
        UserInt.message("Result: " + compMethod.calculate(function));
    }

}
