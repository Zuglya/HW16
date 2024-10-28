import java.util.Scanner;

public class Main {

    public static final String NUM_REGEX = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    public static final String NUM_FORMAT = "+7 ($2) $3 $4-$5";
    public static final String SHORT_NUM_FORMAT = " +7 ($1) $2 $3-$4";

    public static void main(String[] args) {
        //todo Numbers
//        String number = new Scanner(System.in).nextLine().trim();

        String[] numberList = {"+7909123-45-67", "+7 (909) 1234567", "8-905-1234567", "9-453-1234567", "8-905-123", "905-1234567", "8-905-12345672342"};

        for(String e: numberList) {
            String number = e.replaceAll("\\D+", "");
            if(number.length() == 11) {
                number = number.replaceAll("(^\\d)" + NUM_REGEX, NUM_FORMAT);
                System.out.println(number);
            } else if(number.length() == 10) {
                number = number.replaceAll(NUM_REGEX, SHORT_NUM_FORMAT);
                System.out.println(number);
            } else {
                System.out.println(number + " - Это не номер");
            }
//            System.out.println(number);
        }
        System.out.println("");
    }
}