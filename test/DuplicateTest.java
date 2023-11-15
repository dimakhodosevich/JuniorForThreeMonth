import org.junit.Assert;
import org.junit.Test;

public class DuplicateTest {

    @Test
    public void countDuplicateElementPositiveWithDiffetentElements() {
        int[] array = {1, 1, 1, 2, 2, 2, 3, 3, 3};
        int expected = 3;

        Assert.assertEquals(expected, Duplicate.countDuplicateElement(array));
    }

    @Test
    public void countDuplicateElementPositiveWithOneElement() {
        int[] array = {1, 1, 1};
        int expected = 1;

        Assert.assertEquals(expected, Duplicate.countDuplicateElement(array));
    }


    @Test(expected = RuntimeException.class)
    public void countDuplicateElementNegativeWithNull() {
        int[] array = null;

        Duplicate.countDuplicateElement(array);
    }

    @Test(expected = RuntimeException.class)
    public void countDuplicateElementNegativeWithZeroLength() {
        int[] array = {};

        Duplicate.countDuplicateElement(array);
    }

    @Test
    public void copyArrayWithoutDuplicatePositiveWithTheSameElement() {
        int[] array = {1, 1, 1};
        int[] expected = {1};

        Assert.assertArrayEquals(expected, Duplicate.deleteDuplicateFromArray(array));
    }

    @Test
    public void copyArrayWithoutDuplicatePositiveWithDifferentElement() {
        int[] array = {1, 1, 2, 3, 3, 4, 4, 5, 6, 7, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};

        Assert.assertArrayEquals(expected, Duplicate.deleteDuplicateFromArray(array));
    }

    @Test
    public void copyArrayWithoutDuplicatePositiveWithUniqElement() {
        int[] array = {1, 2,3,4,5,6,7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};

        Assert.assertArrayEquals(expected, Duplicate.deleteDuplicateFromArray(array));
    }

    @Test(expected = RuntimeException.class)
    public void copyArrayWithoutDuplicateNegativeWithNull() {
        int[] array = null;

        Duplicate.deleteDuplicateFromArray(array);
    }

    @Test(expected = RuntimeException.class)
    public void copyArrayWithoutDuplicateNegativeWithZeroLength() {
        int[] array = {};

        Duplicate.deleteDuplicateFromArray(array);
    }

    @Test
    public void sortArrayIncreaseWithDifferentElement(){
        int[] array = {3,4,6,1,2,11,4,7,2};
        int[] expected = {1,2,2,3,4,4,6,7,11};

        Assert.assertArrayEquals(expected,Duplicate.sortArrayIncrease(array));
    }

    @Test
    public void sortArrayIncreaseSorted(){
        int[] array = {1,2,3,4,5};
        int[] expected = {1,2,3,4,5};

        Assert.assertArrayEquals(expected,Duplicate.sortArrayIncrease(array));
    }
}
