import java.sql.SQLOutput;
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        System.out.println("Input your sentence: ");
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();

        System.out.printf("The last word is \"%s\" with length %d.",
                findLastWord(msg),
                getWordLength(findLastWord(msg)));
    }

    public static String findLastWord(String msg) {
        if (msg == null) {
            throw new RuntimeException();
        }

        msg = msg.trim();

        if (msg.isEmpty()) {
            return msg;
        }

        int lastSpace = msg.lastIndexOf(" ") + 1;
        String lastWord = msg.substring(lastSpace);

        return lastWord;
    }

    public static int getWordLength(String msg) {
        return Word.findLastWord(msg).length();
    }
}
