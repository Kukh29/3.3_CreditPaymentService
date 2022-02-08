public class CreditPaymentService {
    public float calculate(float amount, float month) {
        float mp = 1_000_000*999/100/100/12; // ежемесечная процентная ставка
        float payment = (float) (amount * (mp/(1-(1+mp)*(1-month))));

        return payment;
    }
}


