package evgenyt.comp_math;

/**
 * Computation result
 */

public class CompResult {
    private double[] results;
    private String error;
    private int iterations;

    CompResult(double[] results, String error, int iterations) {
        this.results = results;
        this.error = error;
        this.iterations = iterations;
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
        return resultStr.append("\nComputed by ").append(iterations).
                append(" iterations").toString();
    }
}
