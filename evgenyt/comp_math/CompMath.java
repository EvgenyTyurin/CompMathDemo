package evgenyt.comp_math;

import java.util.function.UnaryOperator;

/**
 * Computational mathematics methods
 */

public class CompMath {
    /** Typical computations errors*/
    private static final String ERROR_CAN_T_MAKE_HORDE =
            "ERROR: Can't make horde, try another x1 or x2";
    private static final String ERROR_HORDE_IS_PARALLEL =
            "ERROR: Horde is parallel, try another x1 or x2";
    private static final String ERROR_MAX_TRIES_REACHED =
            "ERROR: Max tries reached, maybe function too complex for this method, " +
                    "or it has no roots";

    /**
     * Root-finding by secant method
     *
     * @param func Reference to function
     * @param x1 Left limit of horde
     * @param x2 Right limit of horde
     * @param deviation Max deviation of solution
     * @param maxTries Maximum method tries
     * @param makeLog Show computing log?
     * @return Computation result*
     * */
    public static CompResult secantMethod(UnaryOperator<Double> func,
                                     double x1, double x2, double deviation, int maxTries,
                                     boolean makeLog) {
        int tryCounter = 0;
        do {
            tryCounter++;
            // Points on function - horde points
            double y1 = func.apply(x1);
            double y2 = func.apply(x2);
            if (x1 == x2) {
               return new CompResult(new double[]{}, ERROR_CAN_T_MAKE_HORDE, tryCounter);
            }
            // Horde equitation
            double a = (y2 - y1) / (x2 - x1);
            if (a == 0) {
                return new CompResult(new double[]{}, ERROR_HORDE_IS_PARALLEL, tryCounter);
            }
            double b = y1 - a * x1;
            // Find root of horde equitation
            double root = -1 * b / a;
            // Function on horde zero point
            double y = func.apply(root);
            if (makeLog)
                System.out.println("Try " + tryCounter + ": root=" + root + " y=" + y);
            // Root is found - exit
            if (Math.abs(y) <= deviation) {
                return new CompResult(new double[]{root}, "", tryCounter);
            }
            // No converge - exit
            if (tryCounter >= maxTries) {
                return new CompResult(new double[]{}, ERROR_MAX_TRIES_REACHED, tryCounter);
            }
            // Making new horde
            x1 = root;
        } while (true);
    }

    /**
     * Root-finding by Newtons's method
     *
     * @param func Reference to function
     * @param funcDerivative Reference to derivative function
     * @param x0 Init point
     * @param deviation Max deviation of solution
     * @param maxTries Maximum method tries
     * @param makeLog Show computing log?
     * @return Computation result
     * */
    public static CompResult sirNewtonsMethod(UnaryOperator<Double> func,
                                              UnaryOperator<Double> funcDerivative,
                                              double x0, double deviation, int maxTries,
                                              boolean makeLog) {
        int tryCounter = 0;
        do {
            tryCounter++;
            double x1 = x0;
            x0 = x0 - func.apply(x0) / funcDerivative.apply(x0);
            if (makeLog)
                System.out.println("x=" + x0);
            if (Math.abs(x1 - x0) < deviation)
                return new CompResult(new double[]{x0}, "", tryCounter);

        } while (tryCounter < maxTries);
        return new CompResult(new double[]{}, ERROR_MAX_TRIES_REACHED, tryCounter);
    }

}
