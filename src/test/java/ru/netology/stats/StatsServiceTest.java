package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void calculationSalesAmount(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        long expectedSum = 4687600;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void averageSaleAmount(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        long expectedSum = 390633;
        long actualSum = service.averageSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void maxSalesMonth(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        long expectedSum = 12;
        long actualSum = service.maxSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void minSalesMonth(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        long expectedSum = 1;
        long actualSum = service.minSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void numberMonthsMoreAverageSales(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        long expected = 7;
        long actual = service.numberMonthMoreAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthsBelowAverageSales(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        long expected = 5;
        long actual = service.numberMonthBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
