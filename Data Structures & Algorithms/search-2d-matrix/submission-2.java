class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int bottom = 0;
        int top = matrix.length-1;
        int L = 0;
        int R = matrix[0].length-1;

        while (bottom <= top) {
            int heightIndex = (top + bottom) / 2;

            if(matrix[heightIndex][R] == target){
                return true;
            } else if(matrix[heightIndex][R] > target) {
               top = heightIndex - 1;
            } else if (matrix[heightIndex][R] < target) {
                bottom = heightIndex + 1;
            }
        }

        int row = bottom;

        if(bottom >= matrix.length) return false;

        while (L <= R) {
            int mid = (L + R) / 2;

            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        return false;
    }
}
