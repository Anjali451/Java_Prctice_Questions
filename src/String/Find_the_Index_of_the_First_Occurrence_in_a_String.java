//Problem Source ==> https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

package String;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
