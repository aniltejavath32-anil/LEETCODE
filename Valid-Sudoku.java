1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        Set<String> seen = new HashSet<>();
4        
5        for (int i = 0; i < 9; i++) {
6            for (int j = 0; j < 9; j++) {
7                char number = board[i][j];
8                if (number != '.') {
9                    if (!seen.add(number + " in row " + i) ||
10                        !seen.add(number + " in column " + j) ||
11                        !seen.add(number + " in box " + i/3 + "-" + j/3)) {
12                        return false;
13                    }
14                }
15            }
16        }
17        
18        return true;
19    }
20}
21