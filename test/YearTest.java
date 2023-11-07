import org.junit.Test;
import org.junit.Assert;


public class YearTest {

    @Test
    public void testDefineYearWithLeapYearPositive(){
        int[] years = {1960,1968,1980,1988,2000,2012,2020};

        for (int i = 0; i <= years.length-1; i++) {
            Assert.assertTrue(Year.defineYear(years[i]));
        }
    }

    @Test
    public void testDefineYearWithLeapYearNegative(){
        int[] years = {1961,1963,1985,1987,1900,1800};

        for (int i = 0; i <= years.length-1; i++) {
            Assert.assertFalse(Year.defineYear(years[i]));
        }
    }

}
