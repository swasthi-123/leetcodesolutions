/* 
Given a matrix in which rows and columns are in ascending order find the given element in the matrix
[
[1,5,10],
[3,9,20],
[4,15,30],
]


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        if(matrix.length==0)
            return false;
        int j = matrix[0].length-1;
        while(i<matrix.length && j>=0)
        {
            if(target==matrix[i][j])
                return true;
            else if(target>matrix[i][j])
            {
                i++;
            }
            else if(target<matrix[i][j])
            {
                j--;
            }   
        }
        return false;
        
    }
}
