//Problem Source ==> https://leetcode.com/problems/first-unique-character-in-a-string/description/
package hashing;

import java.util.HashMap;
import java.util.Map;

public class First_Unique_Character_in_a_String {
    public int firstUniqChar(String s){

        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
