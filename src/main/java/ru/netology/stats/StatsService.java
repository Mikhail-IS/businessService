package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales){
        int sumEveryoneSales = 0;

        for (long sum : sales) {
            sumEveryoneSales += sum;
        }
        return sumEveryoneSales;
    }

    public int averageSales(long[] sales){
        int numberMonth = sales.length;
        int sum = sumSales(sales);
        int averageSalesMonth = sum / numberMonth;
        return averageSalesMonth;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int numberMonthMoreAverage(long[] sales) {
        int numberMonth = averageSales(sales);
        int quantityMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > numberMonth) {
                quantityMonth = quantityMonth + 1;
            }

        }

        return quantityMonth;
    }

    public int numberMonthBelowAverage(long[] sales) {
        int numberMonth = averageSales(sales);
        int quantityMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < numberMonth) {
                quantityMonth = quantityMonth + 1;
            }

        }

        return quantityMonth;
    }
}


