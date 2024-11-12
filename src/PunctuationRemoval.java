import java.util.Scanner;

public class PunctuationRemoval {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String input = scanner.nextLine();

        int length = input.length();
        String numberWithoutComma = input.substring(0, length - 4) + input.substring(length - 3);

        System.out.println(numberWithoutComma);

        scanner.close();
    }
}

