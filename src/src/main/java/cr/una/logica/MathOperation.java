package cr.una.logica;

public class MathOperation {
    private static final double pi =  3.14159265359;

    public MathOperation() {
    }

    public double sum(double x, double y) {
        return (x + y);
    }

    public double subtraction(double x, double y) {
        return (x - y);
    }

    public double multiplication(double x, double y) {
        return (x * y);
    }

    public double division(double x, double y) {
        return (x / y);
    }

    public static double getPi() {
        return pi;
    }
}
