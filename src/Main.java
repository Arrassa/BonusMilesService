public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        service.calculate(10_000);
        int price = service.calculate(10_000);
        System.out.println(price);

        System.out.println();
        System.out.println("15_000");
        System.out.println("Ваш бонус: " + service.calculate(15_000));

        System.out.println();
        System.out.println("-20_000");
        System.out.println("Ваш бонус: " + service.calculate(-20_000));

        System.out.println();
        System.out.println("2_000");
        System.out.println("Ваш бонус: " + service.calculate(2_000));


    }
}

