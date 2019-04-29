package evgenyt.comp_math.function;

public class QuadraticFunction extends Function {
    @Override
    public double getF(double[] xArray) {
        return Math.pow(xArray[0], 2);
    }

    @Override
    public double getDerivative(double[] xArray) {
        return 2 * xArray[0];
    }
}
