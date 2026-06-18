class NumMatrix {


    int [][] Num;
    public NumMatrix(int[][] matrix) {

        this.Num = new int[matrix.length+1][matrix[0].length+1];
        for (int i =0;i<matrix.length+1;i++){
            for (int j=0 ; j<matrix[0].length+1;j++){
                if (i==0 || j ==0){
                    this.Num[i][j]=0;
                    continue;
                }
                this.Num[i][j] =matrix[i-1][j-1]+ Num[i-1][j]+ Num[i][j-1]- Num[i-1][j-1];
            }
        }


        for (int i =0;i<matrix.length+1;i++){
            for (int j=0 ; j<matrix[0].length+1;j++){
                System.out.print(Num[i][j]+"\t");
            }
            System.out.println(" ");
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {        
        return Num[row2+1][col2+1]-Num[row2+1][col1]-Num[row1][col2+1]+ Num[row1][col1];
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */