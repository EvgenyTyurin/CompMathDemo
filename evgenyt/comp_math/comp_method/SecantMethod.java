package evgenyt.comp_math.comp_method;

import evgenyt.comp_math.CompResult;
import evgenyt.comp_math.UserInt;
import evgenyt.comp_math.function.Function;

public class SecantMethod extends CompMethod {

    @Override
    public CompResult calculate(Function function) {
        double x1 = UserInt.getDouble("X1:");
        double x2 = UserInt.getDouble("X2:");
        double deviation = UserInt.getDouble("Deviation:");
        int  maxTries = UserInt.getInt("Max tries:");
        int tryCounter = 0;
        do {
            tryCounter++;
            // Points on function - horde points
            double y1 = function.getF(x1);
            double y2 = function.getF(x2);
            if (x1 == x2) {
                return new CompResult(0, UserInt.ERROR_CAN_T_MAKE_HORDE, tryCounter);
            }
            // Horde equitation
            double a = (y2 - y1) / (x2 - x1);
            if (a == 0) {
                return new CompResult(0,UserInt.ERROR_HORDE_IS_PARALLEL, tryCounter);
            }
            double b = y1 - a * x1;
            // Find root of horde equitation
            double root = -1 * b / a;
            // Function on horde zero point
            double y = function.getF(root);
            // Root is found - exit
            if (Math.abs(y) <= deviation) {
                return new CompResult(root, "", tryCounter);
            }
            // Making new horde
            x1 = root;
        } while (tryCounter <= maxTries);
        return new CompResult(0, UserInt.ERROR_MAX_TRIES_REACHED, tryCounter);
    }
}
