package bridge;

import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        long dollars = 700;
        long rubles = 12000;
        double completed_dollars;
        double completed_rubles;
        Transfer transfer1 = new DollarsTransfer(new PayPal());
        completed_dollars = transfer1.transferMoney(dollars);
        System.out.println("Сумма платежа с учетом комиссии " + df.format(completed_dollars) + " RUB");
        Transfer transfer2 = new RublesTransfer(new WesternUnion());
        completed_rubles = transfer2.transferMoney(rubles);
        System.out.println("Сумма платежа с учетом комиссии " + df.format(completed_rubles) + " RUB");

    }
}
