public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = (int) service.calculate(1_000_000, 12, 9.99d);
        System.out.println(payment +" рублей в месяц за год");
        int payment1 = (int) service.calculate(1_000_000, 24, 9.99d);
        System.out.println(payment1 +" рублей в месяц за 2 года");
        int payment2 = (int) service.calculate(1_000_000, 36, 9.99d);
        System.out.println(payment2 +" рублей в месяц за 3 года");
    }
}
