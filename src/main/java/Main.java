import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
//        service.calculate(amount, registered);
        long expected = 30;
        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;
        System.out.println(passed);
    }
}

