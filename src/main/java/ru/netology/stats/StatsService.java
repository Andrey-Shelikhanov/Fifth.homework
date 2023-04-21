package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long averageSales(long[] sales) {
        long total = totalSales(sales);
        return total / sales.length;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int monthsAboveAverage(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
