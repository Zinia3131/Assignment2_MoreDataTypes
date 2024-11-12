import java.util.Scanner;

public class FilePathBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the drive letter (e.g., C): ");
        String drive = scanner.nextLine();

        System.out.print("Enter the path (e.g., \\Windows\\System): ");
        String path = scanner.nextLine();

        System.out.print("Enter the file name (e.g., Readme): ");
        String fileName = scanner.nextLine();

        System.out.print("Enter the file extension (e.g., txt): ");
        String extension = scanner.nextLine();

        String completeFilePath = drive + ":\\" + path + "\\" + fileName + "." + extension;

        System.out.println("Complete file path: " + completeFilePath);

        scanner.close();
    }
}

