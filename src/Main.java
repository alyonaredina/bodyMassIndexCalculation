public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;       //м
        double weight = 98.0;       //кг

        int bmi = service.calculate(1.87, 98.0);      //должно получиться 28

        System.out.println("Индекс массы тела: " + bmi);

        System.out.println();
        System.out.println("рост 1,58 м / вес 49 кг");
        System.out.println(service.calculate(1.58, 49));

        System.out.println();
        System.out.println("рост 1,69 м / вес 60 кг");
        System.out.println(service.calculate(1.69, 60));

    }
}