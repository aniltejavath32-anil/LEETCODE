1class Solution {
2    public void solveSudoku(char[][] board) {
3        solve(board);
4    }
5
6    private boolean solve(char[][] board) {
7        for (int row = 0; row < 9; row++) {
8            for (int col = 0; col < 9; col++) {
9                if (board[row][col] == '.') {
10                    for (char c = '1'; c <= '9'; c++) {
11                        if (isValid(board, row, col, c)) {
12                            board[row][col] = c;
13                            if (solve(board)) {
14                                return true;
15                            } else {
16                                board[row][col] = '.';
17                            }
18                        }
19                    }
20                    return false;
21                }
22            }
23        }
24        return true;
25    }
26
27    private boolean isValid(char[][] board, int row, int col, char c) {
28        for (int i = 0; i < 9; i++) {
29            if (board[i][col] == c) return false;
30            if (board[row][i] == c) return false;
31            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
32        }
33        return true;
34    }
35}
36