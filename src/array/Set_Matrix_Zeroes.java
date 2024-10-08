//Problem Source ==> https://leetcode.com/problems/set-matrix-zeroes/description/
package array;

public class Set_Matrix_Zeroes {

    //Time Complexity ==> O(2(n+m))  Space Complexity ==> O(n+m)
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row[] = new int[n];
        int col[] = new int[m];

        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

/*OPTIMAL SOLUTION  Time Complexity ==> O(2(n+m))  Space Complexity ==> O(1)
* public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int col0 = 1;

        //int row[] =  = {0}; matrix[0][..]
        //int col[m] = {0}; ==> matrix[..][0]

        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                if(matrix[i][j] == 0){
                    //mark the rows
                   matrix[i][0] = 0;

                   //mark the column
                  if(j == 0){
                    col0 = 0;
                  }else{
                     matrix[0][j] = 0;
                  }
                }
            }
        }
        for(int i = 1; i< n; i++){
            for(int j = 1; j<m; j++){
                if( matrix[i][j] != 0){
                   if( matrix[0][j] == 0 ||  matrix[i][0] == 0){
                     matrix[i][j] = 0;
                   }
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j = 0; j<m; j++) matrix[0][j] = 0;
        }

         if(col0 == 0){
            for(int i = 0; i<n; i++) matrix[i][0] = 0;
        }
    }
}
* */
