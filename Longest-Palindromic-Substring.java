1class Solution {
2    public String longestPalindrome(String s) {
3        if (s == null || s.length() < 1) return "";
4        int start = 0, end = 0;
5        for (int i = 0; i < s.length(); i++) {
6            int len1 = expandAroundCenter(s, i, i);
7            int len2 = expandAroundCenter(s, i, i + 1);
8            int len = Math.max(len1, len2);
9            if (len > end - start) {
10                start = i - (len - 1) / 2;
11                end = i + len / 2;
12            }
13        }
14        return s.substring(start, end + 1);
15    }
16
17    private int expandAroundCenter(String s, int left, int right) {
18        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
19            left--;
20            right++;
21        }
22        return right - left - 1;
23    }
24}
25