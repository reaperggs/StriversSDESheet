class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowZero = new HashSet<>();
        HashSet<Integer> colZero = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    // task schedule
                    rowZero.add(i);
                    colZero.add(j);
                }
            }
        }

        // 1st task : saari row zero krdo

        for(int i = 0; i < m; i++){
            if(rowZero.contains(i)){
                for(int j = 0; j < n; j++)
                    matrix[i][j] = 0;
            }
        }

        //2nd task : saari col zero krdo

        for(int j = 0; j < n; j++){
            if(colZero.contains(j)){
                for(int i = 0; i < m; i++){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}

public class SetMatrixZero{
    public static void main(String[] args){
        // ok.
    }
}