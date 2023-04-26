public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // bmi = kg / (m * m)
        // 80 / (1.8 * 1.8) = 24.691

        int kg = 80;
        double m = 1.8;

        int bmi = service.calculate(kg, m);

        System.out.println("Вес(кг): " + kg);
        System.out.println("Рост(м): " + m);
        System.out.println("Индекс массы тела:" + bmi);
    }
}