/**
 * Use Case 10 Normalized Palindrome Validation
 * Description: This class validates a palindrome after preprocessing the input string.
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 * This ensures the palindrome check is logical rather than character-format dependent.
 * Example: A man a plan a canal Panama
 *
 * @author Gauthar Developer
 * @version 10.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point.
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        // Input string as per the example
        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string (Remove spaces/symbols and convert to lowercase)
        // Using regex to replace anything that is NOT a letter or a number
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Step 2: Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit the loop early if a mismatch is found
            }
        }

        // Output the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}