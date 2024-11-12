import java.util.Scanner;

public class TimeDifferenceCalculator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first time (HM): ");
        String firstTime = scanner.nextLine();

        System.out.print("Please enter the second time (HM): ");
        String secondTime = scanner.nextLine();


        int firstTimeInMinutes = convertToMinutes(firstTime);
        int secondTimeInMinutes = convertToMinutes(secondTime);


        int differenceInMinutes;
        if (firstTimeInMinutes <= secondTimeInMinutes) {
            differenceInMinutes = secondTimeInMinutes - firstTimeInMinutes;
        } else
        {
            differenceInMinutes = (24 * 60 - firstTimeInMinutes) + secondTimeInMinutes;
        }


        int hours = differenceInMinutes / 60;
        int minutes = differenceInMinutes % 60;


        System.out.printf("%d hours %d minutes%n", hours, minutes);

        scanner.close();
    }

    private static int convertToMinutes(String time)
    {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(2, 4));
        return hours * 60 + minutes;
    }
}
