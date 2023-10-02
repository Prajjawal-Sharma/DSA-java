class Solution {
    public void setZeroes(int[][] matrix) {
        int row=0;
        int col=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for (int m=0;m<matrix.length;m++){
                        matrix[m][j]=0;
                }
                    for(int n=0;n<matrix[0].length;n++){
                        matrix[i][n]=0;
                    } 
                    
            }
        }
        
        }
    }
}