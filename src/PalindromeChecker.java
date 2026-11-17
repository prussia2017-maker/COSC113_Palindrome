//https://github.com/prussia2017-maker/COSC113_Palindrome.git

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int num) {
        // Negative numbers are not considered palindromes
        if (num < 0) {
            return false;
        }
        // Reverse the number recursively and compare it to the original
        return num == reverseNumber(num, 0);
    }

    /**
     * Recursive helper method that builds the reversed integer digit by digit.
     */
    private static int reverseNumber(int num, int reversed) {

        if (num == 0) {
            return reversed;
        }


        int lastDigit = num % 10;
        reversed = (reversed * 10) + lastDigit;


        return reverseNumber(num / 10, reversed);
    }
}