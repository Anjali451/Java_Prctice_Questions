//Problem Source ==> https://www.youtube.com/watch?v=bR7mQgwQ_o8

package array;

import java.util.*;

public class Pascal_Triangle {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> arr = new ArrayList<>();

            // outer loop to handle rows
            for (int i = 0; i < numRows; i++) {
                List<Integer> res = new ArrayList<>();

                // inner loop to fill values in each row
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        res.add(1);  // First and last elements in each row are 1
                    } else {
                        // Value is the sum of the two values directly above it
                        res.add(arr.get(i-1).get(j-1) + arr.get(i-1).get(j));
                    }
                }

                // Add the current row to the list of rows
                arr.add(res);
            }
            return arr;
        }
    }

