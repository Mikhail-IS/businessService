package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void calculationSalesAmount(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        int expectedSum = 4687600;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void averageSaleAmount(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        int expectedSum = 390633;
        int actualSum = service.averageSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void maxSalesMonth(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        int expectedSum = 12;
        int actualSum = service.maxSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void minSalesMonth(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        int expectedSum = 1;
        int actualSum = service.minSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void numberMonthsMoreAverageSales(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        int expected = 7;
        int actual = service.numberMonthMoreAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthsBelowAverageSales(){
        StatsService service = new StatsService();

        long[] sales = {120200, 200000, 137000, 400000, 666000, 550000, 500000, 430000, 550500, 233700, 200200, 700000};

        int expected = 5;
        int actual = service.numberMonthBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
