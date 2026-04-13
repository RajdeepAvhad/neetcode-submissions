class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = col*row-1;

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            int newstart = mid/col;
            int newend = mid%col;

            if(matrix[newstart][newend]==target)
            {
                return true;
            }
            else if(matrix[newstart][newend] < target)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        } 

        return false;       
    }
}
