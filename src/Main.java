public class Main {

    public static void main(String[] args) {
        BmiServise service = new BmiServise();
        double weight = 65;
        double height = 1.73;
        double resultBmi = service.calculate(weight, height);
        System.out.println(resultBmi);

    }
}
