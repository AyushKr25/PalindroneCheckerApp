/**
 * =========================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =========================================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */
import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // You can also use a hardcoded string like String input = "madam";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        String reversed = "";

        // 1. Reverse string using loop
        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            // Using String Concatenation (+) to build the reversed string
            reversed = reversed + input.charAt(i);
        }

        // 2. Compare original and reversed
        // Using equals() method to compare the actual content
        boolean isPalindrome = input.equals(reversed);

        // 3. Display result
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}