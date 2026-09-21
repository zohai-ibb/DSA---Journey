class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int [][] res = new int[rows * cols][2];

        int step = 1;

        int row = rStart;
        int col = cStart;
        int index = 0;

        while(index < rows * cols ){

            for (int i = 0; i < step; i++) {
                if(row >= 0 && row < rows && col >=0 && col < cols){
                    res[index] = new int[]{row, col};
                    index++;
                }
                col++;
            }

            for (int i = 0; i < step; i++) {
                if(row >= 0 && row < rows && col >=0 && col < cols){
                    res[index] = new int[]{row, col};
                    index++;
                }
                row++;
            }

            step++;


            for (int i = 0; i < step; i++) {
                if(row >= 0 && row < rows && col >=0 && col < cols){
                    res[index] = new int[]{row, col};
                    index++;
                }
                col--;
            }

            for (int i = 0; i < step; i++) {
                if(row >= 0 && row < rows && col >=0 && col < cols){
                    res[index] = new int[]{row, col};
                    index++;
                }
                row--;
            }
            step++;

        }
        return res;
    }
}