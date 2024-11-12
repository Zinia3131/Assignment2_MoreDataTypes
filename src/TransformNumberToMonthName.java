import java.util.Scanner;

public class TransformNumberToMonthName {
    public static void main(String[] args) {

        String months = "January    February   March      April      May        June       July       August     September  October     November    December   ";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-12) for the corresponding month: ");
        int monthNumber = scanner.nextInt();

        if (monthNumber < 1 || monthNumber> 12) {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }
        else {

            int startIndex = (monthNumber - 2) * 12;
            String monthName = months.substring(startIndex, startIndex + 12).trim();

            System.out.println("The month of the number " + monthNumber + " is " + monthName + ".");
        }
        scanner.close();
    }
}

