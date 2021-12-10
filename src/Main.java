public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(85, 181);
        System.out.println(bmi);
    }
}
