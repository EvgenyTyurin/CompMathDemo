package evgenyt.comp_math.functions;

import evgenyt.comp_math.UserInt;

/**
 *  System of linear equations
 */

public class LinearSystem {
    private LinearEquation[] equations;

    public LinearSystem() {
        int equNum = UserInt.getInt("Input number of equations");
        equations = new LinearEquation[equNum];
        for (int equCount = 0; equCount < equNum; equCount++) {
            UserInt.message("*** Input equation №" + (equCount + 1));
            equations[equCount] = new LinearEquation(equNum);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int equCount = 0; equCount < equations.length; equCount++) {
            stringBuilder.append(equations[equCount].toString() + "\n");
        }
        return stringBuilder.toString();
    }

    public LinearEquation[] getEquations() {
        return equations;
    }
}
