class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // transpose (upper triangle only)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse each row
        for (int[] row : matrix) {
            int i = 0, j = row.length - 1;
            while (i < j) {
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
                i++;
                j--;
            }
        }
    }
}
public class RotateMatrix{
    public static void main(String[] args){
        //
    }
}