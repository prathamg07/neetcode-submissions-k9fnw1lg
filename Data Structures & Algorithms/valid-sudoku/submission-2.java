class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i=0;i<9;i++){
            ArrayList <Character> row = new ArrayList<>();
            ArrayList <Character> col = new ArrayList<>();
            for (int j=0;j<9;j++){
                if (board[i][j]!='.'){
                    if (row.contains(board[i][j])){
                        return false;
                    }
                    row.add(board[i][j]);
                }
                if (board[j][i]!='.'){
                    if (col.contains(board[j][i])){
                        return false;
                    }

                    col.add(board[j][i]);
                }
                

            }
        
        ArrayList <Character> ele = new ArrayList<>();
        for (int j=(i/3)*(3); j<(i/3)*(3)+3 ; j++){

            for (int t=(i%3)*3; t<(i%3*3+3) ;t++){               
                if (board[j][t]!='.'){
                    if (ele.contains(board[j][t])){
                        return false;
                    }
                
                    ele.add(board[j][t]);
                }

            }
        }
        }
        return true;
        
    }
}
