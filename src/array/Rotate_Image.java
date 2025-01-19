//Source Code ==> https://leetcode.com/problems/rotate-image/description/
package array;

public class Rotate_Image {

    //Brute Force Approach
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int rotate[][] = new int[n][n];

        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                rotate[j][n-i-1] = matrix[i][j];
            }
        }
    }

    //Optimal Approach

    /*
         public void rotate(int[][] matrix) {
           for(int i = 0; i<matrix.length; i++){
                for(int j = 0; i<matrix[0].length; j++){
                    int temp = 0;

                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
               }
           }

           for(int i = 0; i<matrix.length; i++){
                for(int j = 0; i<matrix.length/2; j++){
                    int temp = 0;

                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix.length - 1 - j];
                    matrix[i][matrix.length - 1 - j] = temp;
               }
           }
         }
    **/
}
