class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int i = matrix.length;
        int j = matrix[0].length;

        int n = i*j;

        int low = 0 ;
        int high=n-1;

        while (high>=low){

            int mid = low + (high-low)/2;

            System.out.println(mid);

            int row = mid / j ;
            int col = mid % j ;

            if(matrix[row][col]==target){
                return true;
            }
            else if ( target > matrix[row][col]){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }

        return false;
        
    }
}
