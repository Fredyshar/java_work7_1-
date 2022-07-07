package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void minMonth() {
        StatsService services = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = services.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void maxMonth() {
        StatsService services = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = services.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void sumOfAllSales() {
        StatsService services = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSumm = 180;
        long actualSumm = services.sumOfAllSales(sales);

        Assertions.assertEquals(expectedSumm, actualSumm);
    }

    @Test
    public void averageSalesAmount() {
        StatsService services = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = services.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void quantityMonthsSalesAboveMiddle() {
        StatsService services = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedQuantity = 5;
        long actualQuantity = services.quantityMonthsSalesAboveMiddle(sales);

        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    public void quantityMonthsSalesBelowMiddle() {
        StatsService services = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedQuantity = 5;
        long actualQuantity = services.quantityMonthsSalesBelowMiddle(sales);

        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }
}
