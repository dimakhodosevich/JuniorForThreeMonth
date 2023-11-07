import java.util.Scanner;

public class Quater {
    private static final String WINTER = "WINTER";
    private static final String SPRING = "SPRING";
    private static final String SUMMER = "SUMMER";
    private static final String AUTUMN = "AUTUMN";
    private static final String NOT_CORRECT = "NOT CORRECT";


    public static void main(String[] args) {

        System.out.println("Please enter number of month:");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        System.out.println(detectQuarter(month));

    }


    public static String detectQuarter(int month){

        String quarterName = NOT_CORRECT;

        switch(month){
            case 12:
            case 1:
            case 2:quarterName = WINTER; break;
            case 3:
            case 4:
            case 5:quarterName = SPRING; break;
            case 6:
            case 7:
            case 8:quarterName = SUMMER; break;
            case 9:
            case 10:
            case 11: quarterName = AUTUMN; break;
        }

        return quarterName;
    }
}
