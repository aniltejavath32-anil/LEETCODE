1class Solution {
2    public String convert(String s, int numRows) {
3        if (numRows == 1 || s.length() <= numRows) {
4            return s;
5        }
6
7        StringBuilder[] rows = new StringBuilder[numRows];
8        for (int i = 0; i < numRows; i++) {
9            rows[i] = new StringBuilder();
10        }
11
12        int currentRow = 0;
13        boolean goingDown = false;
14
15        for (char c : s.toCharArray()) {
16            rows[currentRow].append(c);
17            if (currentRow == 0 || currentRow == numRows - 1) {
18                goingDown = !goingDown;
19            }
20            currentRow += goingDown ? 1 : -1;
21        }
22
23        StringBuilder result = new StringBuilder();
24        for (StringBuilder row : rows) {
25            result.append(row);
26        }
27
28        return result.toString();
29    }
30}
31