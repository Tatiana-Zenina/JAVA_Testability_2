public class BmiService {
    public int calculate(int kg, double m) {

        double bmi = kg / (m * m);

        return (int) bmi;
    }
}