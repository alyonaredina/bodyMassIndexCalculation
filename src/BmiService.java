public class BmiService {
    public int calculate(double a, double b) {

        double result = b / (a * a);

        return (int) result;

    }
}
