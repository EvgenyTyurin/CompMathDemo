package evgenyt.comp_math.comp_method;

import evgenyt.comp_math.CompResult;
import evgenyt.comp_math.UserInt;
import evgenyt.comp_math.function.Function;

import static evgenyt.comp_math.UserInt.ERROR_MAX_TRIES_REACHED;

public class NewtonsMethod extends CompMethod {
    @Override
    public CompResult calculate(Function function) {
        System.out.println("*** Enter parameters for Newton's method");
        double x0 = UserInt.getDouble("X0:");
        double deviation = UserInt.getDouble("Deviation");
        int maxTries = UserInt.getInt("Max tries:");
        int tryCounter = 0;
        do {
            tryCounter++;
            double x1 = x0;
            double y  = function.getF(x0);
            double yd = function.getDerivative(x0);
            x0 = x0 - y / yd;
            if (Math.abs(x1 - x0) < deviation)
                return new CompResult(x0, "", tryCounter);
        } while (tryCounter < maxTries);
        return new CompResult(0, ERROR_MAX_TRIES_REACHED, tryCounter);
    }
}
