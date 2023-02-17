import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WordService count = new WordService(scan());
        count.printResult();
    }

    public static String scan() {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}








