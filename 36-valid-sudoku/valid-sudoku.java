class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = new HashSet<>();
        HashSet<Character> col = new HashSet<>();
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            boxes[i] = new HashSet<Character>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {

                    int boxIdx = (i / 3) * 3 + (j / 3);
                    if (!boxes[boxIdx].add(board[i][j])) {
                        return false;
                    }

                    if (!row.add(board[i][j])) {
                        return false;
                    }
                }
                if (board[j][i] != '.') {
                    if (!col.add(board[j][i])) {
                        return false;
                    }
                }
            }
            row.clear();
            col.clear();
        }
        return true;
    }
}