// Name- Anurag Bonde
import java.util.*;

class LoginApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define valid login credentials
        String validUsername = "Anurag";
        String validPassword = "1234";

        // Prompt user for login credentials
        System.out.println("Login Form");
        System.out.print(" Enter your Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Username Password: ");
        String password = scanner.nextLine();

        // Validate login credentials
        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Successfully login!");
            // Add code here to grant access to the main system
        } else {
            System.out.println("Invalid username or password. Access denied.");
        }

        // Prompt user for basic details
        System.out.println("Reservation Form");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        // Display available trains (train number and name)
        System.out.println("\nAvailable Trains:");
        System.out.println("1. Train 123 - Express");
        System.out.println("2. Train 456 - Superfast");
        System.out.print("Enter the train number: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        // Get class type
        System.out.println("\nClass Types:");
        System.out.println("1. First Class");
        System.out.println("2. Second Class");
        System.out.print("Enter the class type: ");
        int classType = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        // Get date of journey
        System.out.print("Enter the date of journey (dd-mm-yyyy): ");
        String dateOfJourney = scanner.nextLine();

        // Get source and destination
        System.out.print("Enter the source (place): ");
        String source = scanner.nextLine();
        System.out.print("Enter the destination: ");
        String destination = scanner.nextLine();

        // Perform reservation process (insert button functionality)
        System.out.println("\nReservation Successful!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Class Type: " + (classType == 1 ? "First Class" : "Second Class"));
        System.out.println("Date of Journey: " + dateOfJourney);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        scanner.close();
    }
}