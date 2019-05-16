package evgenyt.comp_math.functions;

import evgenyt.comp_math.UserInt;

public class CubicFunction extends Function {
    private double a, b, c, d; // y = a(x)^3 + b*(x)^2 + cx + d

    public CubicFunction() {
        UserInt.message("*** Input parameters for functions y = a(x)^3 + b*(x)^2 + cx + d");
        a = UserInt.getDouble("a:");
        b = UserInt.getDouble("b:");
        c = UserInt.getDouble("c:");
        d = UserInt.getDouble("d:");
    }

    @Override
    public double getDerivative(double x) {
        return 3 * a * Math.pow(x,2) + 2 * b * Math.pow(x, 1) + c;
    }

    @Override
    public double getF(double x) {
        return a * Math.pow(x,3) + b * Math.pow(x, 2) + c * x + d;
    }

    @Override
    public String toString() {
        return a + "x^3 + (" + b +"x^2) + (" + c + "x) + (" + d + ")" ;
    }


}
