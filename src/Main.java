import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their birth month
        System.out.print("Enter your birth month (1 - 12): ");
        int birthMonth = in.nextInt();

        // Validate the entered birth month
        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        // Close the in
        in.close();
    }
}