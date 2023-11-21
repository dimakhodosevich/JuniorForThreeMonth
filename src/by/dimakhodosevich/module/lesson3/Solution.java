public class Solution {
    private static final int MIN_DECIMAL_CHARACTER_VALUE = 0;
    private static final int MAX_DECIMAL_CHARACTER_VALUE = 127;

    private static final int MIN_DECIMAL_CHARACTER_AVAILABLE_CH = 97;
    private static final int MAX_DECIMAL_CHARACTER_AVAILABLE_CH = 122;

    public static void main(String[] args) {
        String s = "Dimaamid";
        System.out.println(deleteAllNonAlphanumericCharacter(s));
        System.out.printf("Your phrase is palindrome: %b", isPalindromee(deleteAllNonAlphanumericCharacter(s)));

    }

    public static String deleteAllNonAlphanumericCharacter(String message) {
        if(isNull(message)||isEmpty(message)){
            return "";
        } else if (isBlank(message)){
            return " ";
        }

        message = message.toLowerCase();

        for (int i = MIN_DECIMAL_CHARACTER_VALUE;
             i <= MAX_DECIMAL_CHARACTER_VALUE; i++) {

            String s = Character.toString(i);

            if (!(i >= MIN_DECIMAL_CHARACTER_AVAILABLE_CH
                    && i <= MAX_DECIMAL_CHARACTER_AVAILABLE_CH))


                message = message.replace(s, "");

        }

        return message;
    }

    public static boolean isPalindromee(String message){
        if(isNull(message)||isEmpty(message)){
            return false;
        }

        int size = message.length();

        for (int i = 0; i < size/2; i++) {
            if(message.charAt(i)!=message.charAt(size-i-1)){
                return false;
            }
        }

        return true;
    }

    public static boolean isEmpty(String message){
        return message.isEmpty();
    }

    public static boolean isNull(String message){
        return message==null;
    }

    public static boolean isBlank(String message){
        return message.isBlank();
    }


}

