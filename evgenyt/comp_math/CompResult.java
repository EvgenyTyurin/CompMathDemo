package evgenyt.comp_math;

/**
 * Computation result
 */

public class CompResult {
    private double[] results;
    private String error;

    CompResult(double[] results, String error) {
        this.results = results;
        this.error = error;
    }

    @Override
    public String toString() {
        StringBuilder resultStr = new StringBuilder();
        if (error.equals("")) {
            for (double result : results)
                resultStr.append(result).append(" ");
        } else {
            resultStr.append(error);
        }
        return resultStr.toString();
    }
}