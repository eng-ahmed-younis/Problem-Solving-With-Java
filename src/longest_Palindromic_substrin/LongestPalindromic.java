package longest_Palindromic_substrin;

public class LongestPalindromic {

    // This function prints the longest palindrome substring
    // It also returns the length of the longest palindrome
    public static String longestPalindrome(String s) {
        int n = s.length();
        // All substrings of length 1 are palindromes
        int maxLen = 1, start = 0;

        if (n == 0)
            return "";
        if (n == 1)
            return s;

        // Nested loop to mark start and end index
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                /*  (j - i + 1): This calculates the length of the current substring.
                The length of a substring from index [i] to index [j] is (j - i + 1).
                if substring is Palindromic then check if is larger or less than
                last Palindromic substring if larger save it in  maxLen
                */
                if (checkPalindromic(s, i, j) && (j - i + 1) > maxLen) {
                    start = i;
                    maxLen = (j - i + 1);
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    // Function to check if a substring s[low..high] is a palindrome
    private static boolean checkPalindromic(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            } else {
                high--;
                low++;
            }
        }
        return true;
    }


    // Driver Code
    public static void main(String[] args) {
     //   String s = "forgeeksskeegfor";
        String s = "porffr";
          System.out.println(LongestPalindromic.longestPalindrome(s));
    }

}
