package Recursive;

public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);

        if (firstChar != lastChar) {
            return false;
        }

        String remainingSubstring = s.substring(1, s.length() - 1);
        return isPalindrome(remainingSubstring);
    }

    public static void main(String[] args) {
        String palindrome = "madam";
        boolean isPalindrome1 = isPalindrome(palindrome);
        System.out.println(palindrome +" is palindrome "+isPalindrome1);
    }

}
