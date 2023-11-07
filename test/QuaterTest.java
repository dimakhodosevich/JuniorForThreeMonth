import org.junit.Test;
import org.junit.Assert;

public class QuaterTest {
    private static final String WINTER = "WINTER";
    private static final String SPRING = "SPRING";
    private static final String SUMMER = "SUMMER";
    private static final String AUTUMN = "AUTUMN";
    private static final String NOT_CORRECT = "NOT CORRECT";

    @Test
    public void testDetectQuarterWinter(){
        int[] arr = {12,1,2};
        for (int i = 0; i < arr.length; i++) {
            Assert.assertEquals(WINTER, Quater.detectQuarter(arr[1]));
        }
    }

    @Test
    public void testDetectQuarterSpring(){
        int[] arr = {3,4,5};
        for (int i = 0; i < arr.length; i++) {
            Assert.assertEquals(SPRING, Quater.detectQuarter(arr[1]));
        }
    }

    @Test
    public void testDetectQuarterSummer(){
        int[] arr = {6,7,8};
        for (int i = 0; i < arr.length; i++) {
            Assert.assertEquals(SUMMER, Quater.detectQuarter(arr[1]));
        }
    }

    @Test
    public void testDetectQuarterAutumn(){
        int[] arr = {9,10,11};
        for (int i = 0; i < arr.length; i++) {
            Assert.assertEquals(AUTUMN, Quater.detectQuarter(arr[1]));
        }
    }

    @Test
    public void testDetectQuarterNotCorrect(){
        int[] arr = {13,100,22};
        for (int i = 0; i < arr.length; i++) {
            Assert.assertEquals(NOT_CORRECT, Quater.detectQuarter(arr[1]));
        }
    }



}
