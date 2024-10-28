import java.util.Scanner;

public class Main {
    private static final String VALID_REGEX = "([А-я-]+\\s)([А-я-]+\\s)([А-я-]+)";

    public static void main(String[] args) {
        //todo ФИО
        Scanner scan = new Scanner(System.in);
        String fio = scan.nextLine();

        if(fio.matches(VALID_REGEX)) {
            System.out.println(fio.replaceAll(VALID_REGEX, "Фамилия: $1\nИмя: $2\nОтчество: $3"));
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}