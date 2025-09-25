import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;            // Get the last digit
            reversed = reversed * 10 + digit;   // Build the reversed number
            number /= 10;                       // Remove the last digit
        }

        return original == reversed;
    }
}
