class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;
        while (left <= right) {
            int crr = (left + right) / 2;
            int row = crr / cols;
            int col = crr % cols;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = crr + 1;
            } else {
                right = crr - 1;
            }
        }
        return false;
    }
}