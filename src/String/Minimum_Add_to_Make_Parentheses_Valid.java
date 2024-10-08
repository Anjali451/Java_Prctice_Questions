//Problem Source ==> https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
package String;

public class Minimum_Add_to_Make_Parentheses_Valid {
        public int minAddToMakeValid(String s) {
            int a = 0, b = 0;
            for(char ch : s.toCharArray())
            {
                if(ch == '(')
                {
                    a++;
                }
                else
                {
                    if(a > 0)
                    {
                        a--;
                    }
                    else
                    {
                        b++;
                    }
                }
            }
            return a+b;
        }
}
