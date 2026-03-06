/**
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ==========================================
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 * * @version 12.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "Level"; //
        // Normalizing for case-insensitivity to pass the "Level" test
        String normalizedInput = input.toLowerCase();

        // Inject the strategy at runtime [cite: 91]
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the selected algorithm [cite: 108]
        boolean isPalindrome = strategy.check(normalizedInput);

        System.out.println("Input: " + input); //
        System.out.println("Is Palindrome?: " + isPalindrome); //
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * ------------------------------
 * This interface defines a contract for all palindrome checking algorithms.
 * Any new algorithm must implement this interface and provide its own validation logic.
 */
interface PalindromeStrategy { // [cite: 119]
    /**
     * @param input string to validate
     * @return true if palindrome, false otherwise
     */
    boolean check(String input); // [cite: 130]
}

/**
 * CLASS - StackStrategy
 * ---------------------
 * This class provides a Stack-based implementation of the PalindromeStrategy interface.
 * It uses LIFO behavior to reverse characters and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy { // [cite: 126]

    /**
     * Implements palindrome validation using Stack.
     */
    public boolean check(String input) { // [cite: 131]

        // Create a stack to store characters.
        java.util.Stack<Character> stack = new java.util.Stack<>(); // [cite: 133]

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) { // [cite: 135]
            stack.push(c);
        }

        // Compare characters by popping from the stack.
        for (char c : input.toCharArray()) { // [cite: 137]
            if (c != stack.pop()) {
                return false; // Mismatch found
            }
        }

        return true; // All characters matched
    }
}