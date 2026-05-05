1class Solution {
2    public int longestValidParentheses(String s) {
3        int maxLen = 0;
4        Stack<Integer> stack = new Stack<>();
5        stack.push(-1);
6
7        for (int i = 0; i < s.length(); i++) {
8            if (s.charAt(i) == '(') {
9                stack.push(i);
10            } else {
11                stack.pop();
12                if (stack.isEmpty()) {
13                    stack.push(i);
14                } else {
15                    maxLen = Math.max(maxLen, i - stack.peek());
16                }
17            }
18        }
19
20        return maxLen;
21    }
22}
23
24