/**
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==========================================
 * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates palindrome validation using object-oriented design.
 * The palindrome logic is encapsulated inside a PalindromeService class.
 * This approach promotes Reusability and Separation of concerns.
 *
 * @author Gauthar Developer
 * @version 11.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "racecar";

        // Instantiate the service class
        PalindromeService service = new PalindromeService();

        // Call the encapsulated method
        boolean isPalindrome = service.checkPalindrome(input);

        // Output the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Loop until the pointers meet in the middle
        while (start < end) {
            // Compare characters at the start and end pointers
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Mismatch found, not a palindrome
            }
            // Move pointers inward
            start++;
            end--;
        }

        return true; // All symmetric characters matched
    }
}