package String;

public class Shortest_Palindrome {
    public String shortestPalindrome(String s) {
        //TIME COMPLEXITY O(N^2)
        // Reverse the input string 's'
        final String t = new StringBuilder(s).reverse().toString();

        // Iterate through the reversed string 't'
        for (int i = 0; i < t.length(); i++) {
            // Check if the original string 's' starts with the current suffix of 't'
            // The substring from index 'i' onwards is compared with the start of 's'
            if (s.startsWith(t.substring(i))) {
                // If a matching prefix-suffix is found, return the result by adding
                // the unmatched part of 't' to the front of 's' to form the palindrome
                return t.substring(0, i) + s;
            }
        }

        // If no matching prefix-suffix is found, the entire reversed string 't'
        // is added in front of 's' to form the shortest palindrome
        return t + s;

/**
        //Knuth-Morris-Pratt Method TIME COMPLEXITY O(N)
        // Edge case: if the string is empty, return it
        if (s.isEmpty()) return s;

        // Create the combined string: original + '#' + reversed
        String t = s + "#" + new StringBuilder(s).reverse().toString();

        // Compute the KMP prefix table
        int[] lps = computeLPSArray(t);

        // The length of the longest palindromic prefix
        int len = lps[t.length() - 1];

        // The unmatched part of the reversed string
        String toAdd = new StringBuilder(s.substring(len)).reverse().toString();

        // Return the shortest palindrome
        return toAdd + s;
    }

    private int[] computeLPSArray(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int length = 0; // length of the previous longest prefix suffix
        int i = 1;

        // Build the lps array
        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1]; // use the previous prefix suffix
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;

 **/
    }
}
