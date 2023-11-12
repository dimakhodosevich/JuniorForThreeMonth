import org.junit.Assert;
import org.junit.Test;

public class WordTest {

    @Test
    public void findLastWordPositiveOneWord() {
        String msg = "Dima";
        String expectedWord = "Dima";
        int expectedLength = 4;

        Assert.assertEquals(expectedWord, Word.findLastWord(msg));
        Assert.assertEquals(expectedLength, Word.getWordLength(msg));
    }

    @Test
    public void findLastWordPositiveFewWords() {
        String msg = "Dima Khodosevich";
        String expectedWord = "Khodosevich";
        int expectedLength = 11;

        Assert.assertEquals(expectedWord, Word.findLastWord(msg));
        Assert.assertEquals(expectedLength, Word.getWordLength(msg));
    }


    @Test
    public void findLastWordPositiveEmpty() {
        String msg = "";
        String expectedWord = "";
        int expectedLength = 0;

        Assert.assertEquals(expectedWord, Word.findLastWord(msg));
        Assert.assertEquals(expectedLength, Word.getWordLength(msg));
    }

    @Test
    public void findLastWordPositiveWithLastBlank() {
        String msg = "Dima Khodosevich ";
        String expectedWord = "Khodosevich";
        int expectedLength = 11;

        Assert.assertEquals(expectedWord, Word.findLastWord(msg));
        Assert.assertEquals(expectedLength, Word.getWordLength(msg));
    }

    @Test(expected = RuntimeException.class)
    public void findLastWordNegativeWithNull() {
        Word.findLastWord(null);
    }


}
