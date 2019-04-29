package evgenyt.comp_math;

/**
 * Computation result
 */

public class CompResult {
    private double result;
    private String error;
    private int iterations;

    public CompResult(double result, String error, int iterations) {
        this.result = result;
        this.error = error;
        this.iterations = iterations;
    }

    @Override
    public String toString() {
        StringBuilder resultStr = new StringBuilder();
        if (error.equals("")) {
            resultStr.append(result);
        } else {
            resultStr.append(error);
        }
        return resultStr.append("\nComputed by ").append(iterations).
                append(" iterations").toString();
    }
}
