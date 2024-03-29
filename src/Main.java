public class Main {
    public static void main(String[] args) {
        int currentBalance = 100; // начальное количество денег на счету клиента
        int topUpAmount = 1400; // сумма пополнения

        int bonusAmount = 0;
        if (topUpAmount > 1000) {
            bonusAmount = topUpAmount / 100; // вычисляем количество бонусных рублей
        }
        int finalBalance = currentBalance + topUpAmount + bonusAmount; // вычисляем итоговый счёт

        System.out.println("Итоговый счёт клиента: " + finalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonusAmount + " рублей");

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}