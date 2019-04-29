package evgenyt.comp_math;

import evgenyt.comp_math.comp_method.CompMethod;
import evgenyt.comp_math.comp_method.NewtonsMethod;
import evgenyt.comp_math.comp_method.SecantMethod;
import evgenyt.comp_math.function.CubicFunction;
import evgenyt.comp_math.function.Function;
import evgenyt.comp_math.function.QuadraticFunction;

import java.util.Scanner;

/**
 * User interaction procedures and messages
 */

public class UserInt {
    /** Typical computations errors*/
    public static final String ERROR_CAN_T_MAKE_HORDE =
            "ERROR: Can't make horde, try another x1 or x2";
    public static final String ERROR_HORDE_IS_PARALLEL =
            "ERROR: Horde is parallel, try another x1 or x2";
    public static final String ERROR_MAX_TRIES_REACHED =
            "ERROR: Max tries reached, maybe function too complex for this method, " +
                    "or it has no roots";

    public static double getDouble(String label){
        System.out.println(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static int getInt(String label){
        System.out.println(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void message(String string) {
        System.out.println(string);
    }

    public static Function askFunction() {
        message("*** Select function:");
        message("1 - Quadratic");
        message("2 - Cubic");
        String funcSelected = getString();
        switch (funcSelected) {
            case "1":
                return new QuadraticFunction();
            case "2":
                return new CubicFunction();
            default:
                return null;
        }
    }

    public static CompMethod askMethod() {
        message("*** Select computation method");
        message("1 - Secant method");
        message("2 - Newton's method");
        message("q - Quit");
        String userInput = getString();
        switch (userInput) {
            case "1":
                return new SecantMethod();
            case "2":
                return new NewtonsMethod();
            case "q":
                return  null;
        }
        return null;
    }

}
