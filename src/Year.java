import java.util.Scanner;

public class Year {
    private static final boolean IS_LEAP_YEAR = true;
    private static final boolean IS_NOT_LEAP_YEAR = false;


    public static void main(String[] args) {
        System.out.println("Enter number of year:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        System.out.printf("Is your year leap? Answer: %b", defineYear(year));
    }

    public static boolean defineYear(int year) {

        return year % 4 == 0 && year%100!=0 || year % 400 == 0? IS_LEAP_YEAR : IS_NOT_LEAP_YEAR;
    }


}
