1class Solution {
2    public int strStr(String haystack, String needle) {
3        int hLen = haystack.length();
4        int nLen = needle.length();
5
6        for (int i = 0; i <= hLen - nLen; i++) {
7            if (haystack.substring(i, i + nLen).equals(needle)) {
8                return i;
9            }
10        }
11
12        return -1;
13    }
14}
15