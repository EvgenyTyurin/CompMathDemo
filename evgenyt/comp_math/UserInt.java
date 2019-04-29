package evgenyt.comp_math;

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
}
