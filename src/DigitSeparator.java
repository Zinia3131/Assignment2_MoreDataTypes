import java.util.Scanner;

public class DigitSeparator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (up to five digits): ");
        int number = scanner.nextInt();

        String numberString = Integer.toString(number);

        for (int i = 0; i < numberString.length(); i++)
        {
            System.out.print(numberString.charAt(i) + " ");
        }
        scanner.close();
    }
}

