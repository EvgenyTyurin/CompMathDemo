package evgenyt.comp_math.function;

public abstract class Function {
    public double getFX(double x) {
        return getF(new double[] {x});
    }
    public double getDerivativeX(double x) {
        return getDerivative(new double[] {x});
    }
    public abstract double getDerivative(double[] xArray);
    public abstract double getF(double[] xArray);
}
