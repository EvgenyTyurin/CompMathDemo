package evgenyt.comp_math.functions;

import evgenyt.comp_math.UserInt;

public class LinearEquation {
    double[] factors;
    double constTerm;

    public LinearEquation(int factorsNum) {
        factors = new double[factorsNum];
        for (int factorIdx = 0; factorIdx < factorsNum; factorIdx++) {
            factors[factorIdx] = UserInt.getDouble("Input coefficient №" + (factorIdx + 1));
        }
        constTerm = UserInt.getDouble("Input constant term");
    }

    public LinearEquation(double[] factors, double constTerm) {
        this.factors = factors;
        this.constTerm = constTerm;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int factorCount = 0; factorCount < factors.length; factorCount++) {
            stringBuilder.append(factors[factorCount]).
                    append("*X" + (factorCount + 1)).
                    append(" ");
        }
        stringBuilder.append("= ").append(constTerm);
        return stringBuilder.toString();
    }

    public double[] getFactors() {
        return factors;
    }

    public double getConstTerm() {
        return constTerm;
    }
}
