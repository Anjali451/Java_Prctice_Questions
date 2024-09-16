/*
A picnic to a famous museum is being planned in a school for class VI. When they reached the spot, the students started quarreling among themselves in the queue. So the teacher came up with an idea of “good string” which is explained below.
Good String is provided as input. All letters in this string are good letters. Good letters need to be used in further computations as explained below.
The teacher asked all the students to convert their names into good names with the help of good string. While converting, they have to calculate the distance. Based on that, she will arrange the students in a queue.
For converting a name into good name, for each letter i in the name, select the nearest letter from the good name. Distance is calculated as the differences between the ASCII values of i and selected good letter. If there are two letters which are equidistant from i, select the letter which is nearest to the previously used good letter. In that case, distance will be the difference of ASCII value of previously used good letter and selected letter. If i is already present in the good string then no need to change it. Initially, previous good letter will be the first letter of good string. Calculate the total distance of the given name.
Given the name of the student who is confused of implementing this task. Help him to calculate the total distance for his name.
Note: Letters from good string can be reused any number of times.

Constraints
1 <= len(good string) <= 100   1 <= len(name) <= 10^4
Good string will consist of lower, upper case alphabets, digits and symbols. Name will consist of only space, lower and upper case alphabets.
Characters are case-sensitive. The ASCII values for all the characters in the good string and name will be between 32 to 126 (both inclusive).

Input ==> First line consists of good string. Second line consists of the name of the student who is confused to implement the task.

Output ==>Print the total distance for that name.

Time Limit (secs) 1

Example 1
Input ==> (@HR*i{kcQl          Vyom
Output ==> 10
Explanation
i
Previous good letter
Current good letter for i
V
(
R
y
R
{
o
{
l
m
l
l
The total distance will be |ASCII(V)-ASCII(R)| + |ASCII(y)-ASCII({)| + |ASCII(o)-ASCII(l)| + |ASCII(m)-ASCII(l)| = 4+2+3+1 = 10.

Example 2
Input ==> 6*K4AQf]gpi     Nainika
Output ==> 33
Explanation
i
Previous good letter
Current good letter for i
N
6
K
a
K
]
i
–
–
n
]
p
i
–
–
k
p
i
a
i
]
Initially, Previous good letter=6. Since K and Q are at the same distance from N, so we select the character which is nearest to previous letter(6) which is K.
i is already present in the good string. So no need to change anything.
Therefore, total distance will be |ASCII(6)-ASCII(K)| + |ASCII(a)-ASCII(])| + |ASCII(n)-ASCII(p)| + |ASCII(k)-ASCII(i)| + |ASCII(a)-ASCII(])| = 21+4+2+2+4 = 33.
* */
package TCS_CodeVita;

import java.util.*;

public class Good_String {
    public static int distance(String s1, String s2){
        int[] a = new int[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            a[i] = (int) s1.charAt(i);
        }
        Arrays.sort(a);
        int res = 0;
        int prev = (int) s1.charAt(0);
        for (int i = 0; i < s2.length(); i++) {
            int b = (int) s2.charAt(i);
            int l = 0, r = a.length - 1;
            int good = Integer.MAX_VALUE;
            int curr = -1;

            while (l <= r) {
                int mid = (l + r) / 2;
                if (a[mid] == b) {
                    curr = prev;
                    good = 0;
                    break;
                } else if (a[mid] < b) {
                    if (Math.abs(a[mid] - b) < good) {
                        good = Math.abs(a[mid] - b);
                        curr = a[mid];
                    } else if (Math.abs(a[mid] - b) == good) {
                        if (Math.abs(curr - prev) > Math.abs(a[mid] - prev)) {
                            curr = a[mid];
                            good = Math.abs(a[mid] - prev);
                        } else {
                            good = Math.abs(curr - prev);
                        }
                    }
                    l = mid + 1;
                } else {
                    if (Math.abs(a[mid] - b) < good) {
                        good = Math.abs(a[mid] - b);
                        curr = a[mid];
                    } else if (Math.abs(a[mid] - b) == good) {
                        if (Math.abs(curr - prev) > Math.abs(a[mid] - prev)) {
                            curr = a[mid];
                            good = Math.abs(a[mid] - prev);
                        } else {
                            good = Math.abs(curr - prev);
                        }
                    }
                    r = mid - 1;
                }
            }
            prev = curr;

            res += good;

        }
        return res;
    }
}
