class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        HashSet<Integer> zeroRows=new HashSet<>();
        HashSet<Integer> zeroColumns=new HashSet<>();
        for(int row=0;row<rows;row++){
            for(int column=0;column<columns;column++){
                if(matrix[row][column]==0){
                    zeroRows.add(row);
                    zeroColumns.add(column);
                }
            }
        }
      for(int row=0;row<rows;row++){
            for(int column=0;column<columns;column++){
                if(zeroRows.contains(row)||zeroColumns.contains(column)){
                    matrix[row][column]=0;
                }
            }
       }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna