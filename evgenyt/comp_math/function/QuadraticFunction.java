package evgenyt.comp_math.function;

import evgenyt.comp_math.UserInt;

public class QuadraticFunction extends Function {
    private double a, b, c; // y = a(x)^2 + b*x + c

    public QuadraticFunction() {
        UserInt.message("*** Input parameters for function y = a(z)^2 + bx + c");
        a = UserInt.getDouble("a:");
        b = UserInt.getDouble("b:");
        c = UserInt.getDouble("c:");
    }

    @Override
    public double getF(double x) {
        return a * Math.pow(x,2) + b*x + c;
    }

    @Override
    public double getDerivative(double x) {
        return a * 2 * x + b;
    }

    @Override
    public String toString() {
        return a + "(x)^2 + (" + b +"x) + (" + c + ")" ;
    }
}
