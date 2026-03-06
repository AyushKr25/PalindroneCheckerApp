/**
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==========================================
 * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms[cite: 156].
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation [cite: 158]
 * - Captures execution start and end time [cite: 159]
 * - Calculates execution duration
 * - Displays benchmarking results [cite: 161]
 * * This use case focuses purely on performance
 * measurement and algorithm comparison[cite: 162, 163].
 * The goal is to introduce benchmarking concepts[cite: 164].
 * * @author Gauthar Developer [cite: 165]
 * @version 13.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point.
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        String input = "Level";
        // Quick normalization for this test
        String normalizedInput = input.toLowerCase();

        // 1. Capture execution start time
        long startTime = System.nanoTime();

        // 2. Run the algorithm
        boolean isPalindrome = checkPalindromeBasic(normalizedInput);

        // 3. Capture execution end time
        long endTime = System.nanoTime();

        // 4. Calculate execution duration
        long duration = endTime - startTime;

        // Display results
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("Execution Time: " + duration + " ns");
    }

    /**
     * Helper method to simulate a palindrome algorithm.
     */
    public static boolean checkPalindromeBasic(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}