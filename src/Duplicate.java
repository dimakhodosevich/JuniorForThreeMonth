import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) {


        System.out.println("Input size of your array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Input %d element: ", i + 1);
            array[i] = scanner.nextInt();
        }

        System.out.println("Your array without dublicates: ");
        int[] arrayWithoutDublicate = deleteDuplicateFromArray(array);
        System.out.println(Arrays.toString(arrayWithoutDublicate));
        System.out.println();
    }

    public static int countDuplicateElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        int counterUniqElement = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                counterUniqElement++;
            }
        }

        return counterUniqElement;
    }

    public static int[] deleteDuplicateFromArray(int[] array) {

        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        array = sortArrayIncrease(array);

        int counterUniqElement = countDuplicateElement(array);

        if (array.length == counterUniqElement) {
            return array;
        }

        int[] arrayWithoutDuplicate = new int[counterUniqElement];

        arrayWithoutDuplicate[0] = array[0];

        for (int i = 1, j = 1; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                arrayWithoutDuplicate[j++] = array[i + 1];
            }
        }

        return arrayWithoutDuplicate;
    }

    public static int[] sortArrayIncrease(int[] array) {

        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        for (int i = 0; i < array.length - 1; i++) {

            boolean flag = false;

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int save = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = save;
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }
        return array;
    }
}
