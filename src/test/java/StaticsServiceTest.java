import org.junit.jupiter.api.Test;
import ru.netology.StaticsService;

import static org.junit.jupiter.api.Assertions.*;

public class StaticsServiceTest {
    StaticsService service = new StaticsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    public void shouldTotalSales() {

        int expectedSum = 180;
        long actualSum = service.totalSales(sales);

        assertEquals(expectedSum, actualSum);
    }

gig
    @Test
    public void shouldAverageSales() {

        int expectedAverage = 15;
        long actualAverage = service.averageSales(sales);

        assertEquals(expectedAverage, actualAverage);
    }


    @Test
    public void shouldMaxSalesMonth() {

        int expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldMinSalesMonth() {

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldNumberSalesBelowAverage() {

        int expectedSumMonth = 5;
        long actualSumMonth = service.belowAverage(sales);

        assertEquals(expectedSumMonth, actualSumMonth);
    }

    @Test
    public void shouldNumberSalesAboveAverage() {

        int expectedSumMonth = 5;
        long actualSumMonth = service.aboveAverage(sales);

        assertEquals(expectedSumMonth, actualSumMonth);
    }

}
