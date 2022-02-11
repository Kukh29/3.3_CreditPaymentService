public class CreditPaymentService {
    public float calculate(int amount, int month, double percent) {
        double mp = percent/100/12; // ежемесечная процентная ставка
        double pow = Math.pow (1+mp,month);
        double payment = (amount * (mp+(mp/(pow-1))));

        return (float) payment;
    }
}


