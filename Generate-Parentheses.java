1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> result = new ArrayList<>();
4        backtrack(result, "", 0, 0, n);
5        return result;
6    }
7
8    private void backtrack(List<String> result, String current, int open, int close, int max) {
9        if (current.length() == max * 2) {
10            result.add(current);
11            return;
12        }
13
14        if (open < max) {
15            backtrack(result, current + "(", open + 1, close, max);
16        }
17        if (close < open) {
18            backtrack(result, current + ")", open, close + 1, max);
19        }
20    }
21}
22