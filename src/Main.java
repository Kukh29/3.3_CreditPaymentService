public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        float payment = (float) service.calculate(1_000_000, 12);
        System.out.println(payment +" рублей в месяц за год");
        float payment1 = (float) service.calculate(1_000_000, 24);
        System.out.println(payment1 +" рублей в месяц за 2 года");
        float payment2 = (float) service.calculate(1_000_000, 36);
        System.out.println(payment2 +" рублей в месяц за 3 года");
    }
}
