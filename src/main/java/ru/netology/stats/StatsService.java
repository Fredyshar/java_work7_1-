package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) { // номер месяца с минимальными продажами
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) { // номер месяца с максимальными продажами
        int maxMontch = 0;
        int montch = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMontch]) {
                maxMontch = montch;
            }
            montch = montch + 1;
        }
        return maxMontch + 1;
    }

    public long sumOfAllSales(long[] sales) { // сумма всех продаж
        long summ = 0;
        long result = 0;
        for (int i = 0; i < sales.length; i++) {
            summ = result;
            result = (summ + sales[i]);
        }
        return result;
    }

    public long averageSalesAmount(long[] sales) { // Среднее значение из всех продаж
        long averange = sumOfAllSales(sales) / sales.length;
        return averange;
    }

    public long quantityMonthsSalesAboveMiddle(long[] sales) { // Кол-во месяцев в которых продажи выше среднего
        int quanity = 0;
        for (long sale : sales) {
            if (sale > averageSalesAmount(sales)) {
                quanity++;
            }
        }
        return quanity;
    }

    public long quantityMonthsSalesBelowMiddle(long[] sales) { // Кол-во месяцев в которых продажи ниже среднего
        int quanity = 0;
        for (long sale : sales) {
            if (sale < averageSalesAmount(sales)) {
                quanity++;
            }
        }
        return quanity;
    }
}
